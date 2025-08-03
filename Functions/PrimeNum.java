import java.util.Scanner;
class PrimeNum{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Prime number! ");
        System.out.print("Enter your digit : ");
        int  a = scanner.nextInt();
        boolean primeNo = primeNo(a);
        if(primeNo){
            System.out.println(a + " is a prime number");
        }
        else{
            System.out.println(a + " is not a prime number ");
        }
        

    }

    public static boolean primeNo(int a){
        if (a == 0 || a == 1){
            return false;
        }
        int i = 2;
        while( i<a){
            if (a%i == 0){
                return false;
            }

            i++;
           
        }

        return true;
    }
}