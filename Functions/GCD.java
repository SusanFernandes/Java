import java.util.Scanner;
class GCD{
    public static void main(String [] arg){
        System.out.println("Welcome to GCD !");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = scanner.nextInt();
        System.out.print("Enter your second number : ");
        int second = scanner.nextInt();
        int gcd = gcd(first, second);
        System.out.print("GCD of the numbers is : " + gcd);

    }

    public static int gcd(int a, int b){
        int num = 1;
        int i = 2;
        int least = least(a,b);
        while(i<=least){
            if (a% i ==0 && b%i==0){
                num = i;
            }
            i++;
        }
        return num;
    }
    public static int least(int a, int b){
        if(a<b){
            return a;
        } else{
            return b;
        }
    }
}