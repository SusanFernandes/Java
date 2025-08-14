import java.util.Scanner;

class ArraySearch{

    
    public static void main(String [] args){
        System.out.println("Welcome to Array Traversal Search and Print! ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int a [] = { 1,4,324,54,334,43,70};
        boolean isFound =SearchElement(num, a);
        if (isFound){
            System.out.println("Number found");
        }
        else{
            System.out.println("Number not found");


        }


    }

    public static boolean SearchElement(int num, int a[]){
        for(int i =0; i<= a.length; i++ ){
            if (a[i]== num){
                System.out.println("Number found at index : "+ i);
                return true;
            }
            else{
                return false;
            }
        }
    return false;
    }
}