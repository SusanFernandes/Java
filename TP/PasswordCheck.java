import java.util.Scanner;

public class PasswordCheck {

    public static int CheckPassword(char str[], int n) {
        if (n < 4) {
            System.out.println("Password should have min 4 characters");
            return 0;
        }

        if (Character.isDigit(str[0])) {
            return 0;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < n; i++) {
            char ch = str[i];

            if (ch == ' ' || ch == '/') {
                return 0;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
        }

        if (hasDigit && hasUpper) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {            

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String a = sc.nextLine();  

        int result = CheckPassword(a.toCharArray(), a.length());
        System.out.println(a + " -> " + (result == 1 ? "Valid" : "Invalid"));

        sc.close();
    }
}
