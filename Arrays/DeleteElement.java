import java.util.Scanner;


class DeleteElement{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Delete an Element from an array!");
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        int arr [] = new int [a];
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
        int delete = sc.nextInt();

        int deleteNum = newArr(arr, delete);

    }

    public static int newArr(int arr[], int delete){
        for (int i =0; i<arr.length; i++){
            if(arr[i] == delete){
                
            }
        }


        return 0;
    }
}