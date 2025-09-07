import java.util.Scanner;

class MaxMin{
    public static void main(String [] args){
        System.out.println("Welcome to function to find min and max of the array!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array : ");
        int length = sc.nextInt();
        int a []= new int[length];

        for(int i = 0; i <length; i++){
            System.out.print("Enter the number for index "+ i +" : ");
            a[i] = sc.nextInt();
        }

        int max = Max(a);
        int min = Min(a);

        System.out.println("Max of the array is : "+ max);
        System.out.println("Min of the array is : "+ min);



    }

    public static int Max(int a[]){
        if(a.length==0){
            return Integer.MIN_VALUE;
        }
        int max = a[0];
        int i= 1 ;
        while (i<a.length){
            if(a[i]> max){
                max = a[i];
            }
            i++;
        }

        return max;

    }

    public static int Min(int a []){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i<a.length){
            if(a[i]< min){
                min = a[i];
            }
            i++;
        }



        return min;

    }

}