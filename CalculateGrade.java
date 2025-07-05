import java.util.Scanner;
class CalculateGrade{
    public static void main(String [] args){
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter your percentage %  : ");
        int n = grade.nextInt();
        System.out.println("Your grade is : "+ n);
        char i;
        if (n> 90){
            i= 'A';
            System.out.println("Your grade is : "+ i);
        } 
        else if (n>75){
            i= 'B';
            System.out.println("Your grade is : "+ i);
        }
        else if (n>60){
            i= 'C';
            System.out.println("Your grade is : "+ i);
        }
        else if (n>30){
            i= 'D';
            System.out.println("Your grade is : "+ i);
        }
        else {
            i= 'F';
            System.out.println("Your grade is : "+ i);
        }
        
    }
}