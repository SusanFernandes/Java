import java.util.Scanner;
import java.io.Console;

class LeapYear{
    public static void main(String [] args){
        Scanner leapyear = new Scanner(System.in);
        System.out.print("Enter the year you want to check if leap year :");
        int year = leapyear.nextInt();

        if ((year % 4 ==0 && year%100 != 0) || year % 400 == 0 ){
            System.out.println("Year is a leap year");
        } else System.out.println("Year is not a leap year");

        // Just tried entry from console
        // Console console = System.console();
        // char[] password = console.readPassword("Enter password: ");
        // System.out.println("Password length: " + password.length);
        // System.out.println("Password : " + password);

    }
}