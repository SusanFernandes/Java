import java.util.Scanner;

class PatternThree{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pattern");
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();
        pattern(num);

    }

    public static void pattern(int num){
        for (int i=num; i>0; i--){
            // System.out.print("- ");
            int j;
            for(j= i; j>0; j--){
                System.out.print("  ");
                }
            int k = 0;
            while(k<=(num-i) ){
                    System.out.print("* ");
            k++;    
            }
            
            System.out.println();
    }
}
}