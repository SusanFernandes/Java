import java.util.Scanner;
class DigitSum{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digits! ");
        System.out.print("Enter you digit : ");
        int digit = scanner.nextInt();
        int sum = sumOfDigit(digit);
        System.out.println("The sum of "+ digit+ " is : "+ sum);


    }

    public static int sumOfDigit(int digit){
        int sum = 0  ;
        while(digit>0 ){
            sum += digit % 10;
            digit /= 10;
        }
        
        return sum;
    }
}