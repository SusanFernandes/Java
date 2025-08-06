import java.util.Scanner;

class PatternTwo{
    public static void main(String [] args){
        System.out.println("Welcome to Reverse triangle pattern. ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the max number:  ");
        int num = input.nextInt();
        reversePattern(num);

    }

    public static void reversePattern(int num){
        for(int i =num; i>=0; i-- ){
            System.out.print("* ");
            for(int j =i; j>0; j--){
                System.out.print("* ");
            }

            System.out.println();
        }
        
    }
}