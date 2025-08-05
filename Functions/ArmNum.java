import java.util.Scanner;

class ArmNum{
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check Armstrong Numbers!");
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        
        boolean isArmstrong = isArmNum(num);
        if (isArmstrong){
            System.out.println("Your number is Armstrong");
        }
        else{
             System.out.println("Your number is not Armstrong");
        }

    }

    public static boolean isArmNum(int num){
        int NumOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNum  = 0;
        while(num > 0){
            int lastDigit =num%10;
            num/=10;
            finalNum += pow(lastDigit, NumOfDigits);

        }
        return finalNum == numCopy;

    }

    public static int pow(int num1, int num2){
        int result =1;
        int i =0;
        while(i<num2){
            result *= num1;
            i++;
        }

        return result;

    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num>0){
            digits++;
            num/=10;
        }

        return digits;
    }

}