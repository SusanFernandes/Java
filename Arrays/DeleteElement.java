import java.util.Scanner;


class DeleteElement{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Delete an Element from an array!");
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        int arr [] = new int [a];
        //getting array input
        for(int i =0; i <arr.length; i++){
            System.out.print("Enter the element for index " + i+ " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements using for loop:");
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        System.out.println("");
        System.out.print("Enter the number you want to delete : ");
        int numToDelete = sc.nextInt();

        int [] newArr = deleteNumber(arr, numToDelete);

        System.out.println("New Array is: ");
        System.out.print("[ ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println("]");

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

    public static int [] deleteNumber(int arr[], int numToDelete){
        int occ = numOfOccurences(arr, numToDelete);
        if (occ ==0){
            return arr;
        }
        int newSize = arr.length - occ;
        int [] newArr = new int [newSize];
        int i= 0, j=0;
        while(i<arr.length){
            if(arr[i] != numToDelete){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }


        return newArr;
    }
}