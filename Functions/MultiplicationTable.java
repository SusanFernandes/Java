import java.util.Scanner;

class MultiplicationTable{

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to muplication");
        System.out.print("Enter your number : ");
        int num = scanner.nextInt();
        printTable(num);


    }

    public static void printTable(int num){
        //using for loop i did yay!! 
        for (int i = 0; i <= 10; i++){
            int x= num * i;
            System.out.println(num + " x " + i + " = " +x);
        }


        //using while loop
        int i =0;
        while(i<=10){
            int x= num * i;
            System.out.println(num + " x " + i + " = " +x);
            i++;
        }

    }

}