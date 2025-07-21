import java.util.Scanner;

class SumOdd{

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum!");
        System.out.println("Enter the number of digits to be added : ");
        int num = scanner.nextInt();
        int sum = oddsum(num);
        System.out.println("Odd sum till "+ num+ " is : "+ sum);


    }


    public static int oddsum(int num){
        int sum = 0;
        //this is while
        int i = 1;
        while(i<=num){
            sum += i;
            i+=2;
        }

        //this  is for 
        // for (int i = 1; i<=num; i+=2){
        //     sum = i + sum;

        // }

        return sum;

    }
}