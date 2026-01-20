import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = sc.nextLine();
        System.out.println("Please enter your password: ");
        int password = sc.nextInt();

        String usrnme = "admin";
        int psswrd = 1234;

        if (username.equals(usrnme) && password == psswrd) {
            System.out.println("Successful logged in. Welcome!");
        } else if (!username.equals(usrnme)) {
            System.out.println("Username is wrong");
        } else if (password != psswrd) {
            System.out.println("Password is wrong");
        } else {
            System.out.println("Username and password is wrong");
        }

        sc.close();
    }
}
