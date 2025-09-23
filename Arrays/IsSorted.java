import java.util.Scanner;

class IsSorted {
    public static void main(String args[]) {
        System.out.println("Welcome to check array is sorted or No!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int a = sc.nextInt();

        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter your number at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        boolean m = IsIncreasing(arr);
        boolean n = IsDecreasing(arr);

        if (m || n) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean IsIncreasing(int a[]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean IsDecreasing(int a[]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
