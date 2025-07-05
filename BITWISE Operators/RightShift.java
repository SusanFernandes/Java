import java.util.Scanner;

class RightShift{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise RightShift >> operator");
        System.out.println("Please enter no.: ");
        int num = input.nextInt();
        int result = num >> 1; //here 1 can be changed to whatever  shift you want 
        System.out.println("Result is : " + result);

    } 
}
//Happens in binary form 0011 etc and 8 bits eg 0100 -> 0010 basically here 4 -> 2