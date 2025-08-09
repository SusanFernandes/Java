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
        // for(int i =num; i>0; i-- ){
        //     // System.out.print("* ");
        //     for(int j =i; j>0; j--){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        // int m= num;
        // while(m>=0){
        //     System.out.print("* ");
        //     int n = m;
        //     while(n>0){
        //         System.out.print("* ");
        //         n--;
        //     }
        //     System.out.println();
        //     m--;
        // }
        
        int m = num;
        while(m >0){
            int n =0;
            while(n<m){
                System.out.print(" *");
                n++;

            }
            System.out.println();
            m--;
        }
        
    }
}