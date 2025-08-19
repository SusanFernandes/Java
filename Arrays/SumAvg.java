import java.util.Scanner;

class SumAvg{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int len = scanner.nextInt();
        int nums[] = new int[len];
        int i = 0;
        while(i<len){
            System.out.println("Please enter your element no. " + (i+1) + " : ");
            nums[i]= scanner.nextInt();
            i++;
        }
        System.out.println("The sum of all the elements in the array is : " + sum(nums));
        System.out.println("The average of all the elements in the array is : " + avg(nums));

    }

//method for sum of all elements in the array
    public static long sum(int []a){
        long    Sum = 0;

        for(int i =0; i <a.length; i++){
            
            Sum += a[i];

        }
        return Sum;
            
        }


//method for the average of all the elements in the array
    public static long avg(int []a ){
        // long sum =0;
        // int count =0;

        // for (int i=0; i<a.length; i++){
        //     sum += a[i];
        //     count ++;

        // }
        // long Avg = sum/ count;

        // return Avg;

        long sum = sum(a);
        return (int)(sum/a.length);

    }
}