import java.util.Scanner;

class Factorial{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial! ");
        System.out.print("Enter the number you want factorial for: ");
        int num= input.nextInt();
        long fact = factorial(num);
    }

    public static long factorial(int num){
        long fact = 1;

        for(int i =1; i<=num; i++){
            if (num ==0 || num == 1){
                return 1;
            }
            fact = fact*i;
        }

        // int j = 2;
        // while(j<= num){
        //     fact*= j;
        //     j++;
        // }
        System.out.println("Factorial is : " + fact);
        return fact;
    }
}