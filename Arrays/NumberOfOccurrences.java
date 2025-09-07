import java.util.Scanner;

class NumberOfOccurrences{

    public static void main(String  [] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Number of Occurences! ");
        System.out.print("Enter the length of the array : ");
        int length = scanner.nextInt();
        int []a = new int[length];
        System.out.print("Enter the number you want to find: ");
        int num = scanner.nextInt();
        //input of array digits
        for (int i =0; i<length; i++){
            System.out.print(" Enter the number "+(i+1)+ " : ");
            a[i]= scanner.nextInt();
        }
        int occurrences = numOfOccurences(a, num);
        System.out.println("Your number"+ num +" was found "+ occurrences +" times in the array");

    }

    public static int numOfOccurences(int []a, int num){
        int count =0;
        int i = 0;
        while(i<a.length){
            if (a[i]== num){
                count ++;
            }
            
            i++;
        }
        return count;
    
    }
}