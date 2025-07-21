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
        int fact = 1;

        for(int i =1; i<=num; i++){
            if (num ==0){
                return 1;
            }
            fact = fact*i;
        }
        
        return fact;
    }
}