import java.util.Scanner;
class LCM{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to LCM of Digits! ");
        System.out.print("Enter your first digit : ");
        int  a = scanner.nextInt();
        System.out.print("Enter your second digit : ");
        int  b = scanner.nextInt();
        int lcm = lcm(a,b);
        System.out.println("LCM is : " + lcm);
    
    }

    public static int lcm(int a, int b){
        int i = 1 ;
        while (i<= b){
            int factor = a*i;
            if ( factor %  b == 0){
                return factor;

            }

            i++;
        }

        return 0;
    }
}