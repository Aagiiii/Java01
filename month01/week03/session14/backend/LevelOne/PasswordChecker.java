import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String defaultPassword = "secret123";
       int attempts =0;
       int maxAttempts =3;
       while (attempts < maxAttempts) {
        System.out.println("Please enter your password: ");
        String pass = sc.nextLine();

        if (pass.equals(defaultPassword)) {
            System.out.println("Successfully logged in");
            return;
        }else{
            attempts++;
            System.out.println("Wrong! Your left attempts: " + (maxAttempts- attempts));
        }
       }
       if (attempts>= maxAttempts) {
        System.out.println("Your account is blocked");
        return;
       }
       sc.close();
    }
}
