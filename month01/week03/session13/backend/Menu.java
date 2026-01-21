import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n=== MENU ===");
            System.out.println("1. Start");
            System.out.println("2. Setting");
            System.out.println("3. Log out");
            System.out.println("Choice is: ");
            choice = sc.nextInt();
            if (choice ==1) {
                System.out.println("Started");
            }else if (choice ==2) {
                System.out.println("System is open");
            }else if (choice ==3) {
                System.out.println("Bye");
            }else{
                System.out.println("Wrong choice");
            }
        } while(choice <3);

        sc.close();
    }

}
