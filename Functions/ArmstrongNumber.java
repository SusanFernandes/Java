import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check Armstrong Numbers!");
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        ArmNum(num);
    }


    public static void ArmNum(int a){
        int armNum = 0;
        int dup = a;
        int count= 0;
        int b = a;
        while(b>0 ){
            int i = b%10;
            b/=10;
            count++;
        }
        while (a>0){
            int i = a%10;
            a/=10;
            int j = (int)Math.pow(i, count);
            armNum += j;
        }
        if (armNum == dup){
            System.out.println(dup + " is an Armstrong Number. ");
        }
        else {
            System.out.println(dup + " is not an Armstrong Number.");
        }
    }
}


// //alternate method:
// class Main {
//     public static void main(String[] args) {
//         System.out.println("Try programiz.pro");

//         int a = 153;
//         int armNum = 0;
//         int dup = a;

//         int count = 0;
//         int b = a;

//         // Count number of digits
//         while (b > 0) {
//             b /= 10;
//             count++;
//         }

//         // Reset b for processing digits
//         b = a;

//         while (b > 0) {
//             int i = b % 10;
//             b /= 10;

//             int j = 1;
//             for (int k = 0; k < count; k++) {
//                 j *= i;
//             }

//             armNum += j;
//         }

//         if (armNum == dup) {
//             System.out.println(dup + " is an Armstrong Number.");
//         } else {
//             System.out.println(dup + " is not an Armstrong Number.");
//         }
//     }
// }
