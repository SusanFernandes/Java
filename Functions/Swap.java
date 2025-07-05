// import java.util.Scanner;
// public class Swap {
//    public static void main(String [] a){
//     int x;
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("Enter value for x: ");
//     x = scanner.nextInt();
//     int y;
//     System.out.print("Enter value for y: ");
//     y = scanner.nextInt();
//     int temp;

//     System.out.println("before swapping x : " +x + " & y : " +y);

//     temp = x;
//     x=y;
//     y = temp;
//     System.out.println("and after swapping x : " +x + " & y : " +y);
 
//    }
// }

import java.util.Scanner;

class Swap{
   public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number : ");
      int a = input.nextInt();
      // System.out.println("");
      System.out.print("Enter the second number : ");
      int b = input.nextInt();

      //swapping 
      a =  a + b; 
      b = a - b;
      a = a-b;
      System.out.print("After swapping the first number is "+ a + " and the second number is "+ b);



   }
}
