import java.util.Scanner;

class Palindrome {
    public static void main(String args[]){
        System.out.println("Welcome to Palindrome Checker!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        // boolean palindrom = isPalindrome(num);
        /**if (isPalindrom){
         * System.out.println("The number is a Palindrome Number");

        }
        else{
            System.out.println("The number is not a Palindrome Number");
        }
         * 
        } */
        int b = flip(num);
        if (num == b){
            System.out.println("The number is a Palindrome Number");

        }
        else{
            System.out.println("The number is not a Palindrome Number");
        }

    }

    
    public static int flip(int num){
        int flip =0;
        while(num>0){
            int a = num % 10;
            flip = (flip*10) + a;
            num/=10;
            
        }
        System.out.println(flip);
        return flip;
    }

    // public static boolean isPalindrom(int num){
    //  
    //     return num == flip(num);
        
    // }

}