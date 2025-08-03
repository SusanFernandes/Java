
import java.util.Scanner;
class FibSeries{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();

        Fib(a);

    }

    public static void Fib(int a ){
        if (a < 0 ) return;
        System.out.print(" 0 ");
        if (a == 0) return; 
        System.out.print("1 ");


        int i = 0, j = 1;

        while (i + j <= a){
            int newFib = i+ j;
            System.out.print(newFib + " ");
            i = j;
            j= newFib;  
        }

    }
}