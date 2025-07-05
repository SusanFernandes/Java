import java.util.Scanner;

class Or{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise OR | operators");
        System.out.println("Please enter first no.: ");
        int first = input.nextInt();
        System.out.println("Please enter second no.: ");
        int second = input.nextInt();

        int result = first | second; 
        System.out.println("Result is : " + result);

    } 
}
//Happens in binary form 0011 etc c and 8 bits