import java.util.Scanner;

class Fibonacci{
    public static int solution(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int newFib;
        for (int i = 0;  i<=n; i++){
            newFib = a+b;
            System.out.println(newFib);
            a = b;
            b= newFib;
        }
    return b;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        solution(n);
    }
}