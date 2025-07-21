import java.util.Scanner;

class ReturnStatement{
    public static void main(String [] args){

        greet();// function calls make the function jump from up to down or to the function
        System.out.println("Welcome to calculator");
        int first = readNumber();
        int second = readNumber(); //function calls are just expressions, if int then returns a value
        int sum = first + second;
        System.out.print("Sum is: " + sum);


    }    


    public static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number= scanner.nextInt();

        return number;

    }


//returns a number/expression again to wherever called

    public static void greet(){
        System.out.print("Welcome to the calculator");

        
    }

} 