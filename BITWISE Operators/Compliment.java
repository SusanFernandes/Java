import java.util.Scanner;

class Compliment{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise COMPLIMENT ~ (not) operators");
        System.out.println("Please enter no.: ");
        int num = input.nextInt();
        int result = ~ num;
        System.out.println("Result is : " + result);

    } 
}
//Happens in binary form 0011 etc and 8 bits