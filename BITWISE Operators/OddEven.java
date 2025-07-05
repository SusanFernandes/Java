import java.util.Scanner;

class OddEven{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise operator Odd Even");
        System.out.println("Please enter no.: ");
        int num = input.nextInt();
        if ((num & 1)==1){
            System.out.println("Your number is odd");  
        }else{
            System.out.println("Your number is even");  
        }
    }
}