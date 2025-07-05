import java.util.Scanner;

class LeftShift{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise LeftShift << operator");
        System.out.println("Please enter no.: ");
        int num = input.nextInt();
        int result = num << 1; //here 1 can be changed to whatever  shift you want 
        System.out.println("Result is : " + result);

    } 
}
//Happens in binary form 0011 etc and 8 bits eg 0100 -> 1000 basically here 4 -> 8