import java.util.Scanner;
class ReverseDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Reverse of Digits! ");
        System.out.print("Enter your digit : ");
        int a = sc.nextInt();
        int reverseDigit = reverseDigit(a );
        System.out.println("The reversed digit is : " + reverseDigit);
    }

    public static int reverseDigit(int a){
        int i = 0;
        int reversedDigit = 0; 
        // while (a>0){
        //     i = a%10;
        //     a /= 10;
        //     reversedDigit= (reversedDigit * 10 )+ i;

        // }
        // return reversedDigit;

        for (; a > 0; a /= 10) {
        i = a % 10;
        reversedDigit = (reversedDigit * 10) + i;
        }
        return reversedDigit;


    }

}