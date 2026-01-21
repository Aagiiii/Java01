import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the num: ");
        int i = sc.nextInt();
        int mul =1;
        for (int j = 1; j <=i; j++) {
            mul*=j;
        
        }
        System.out.println("Factorial of " + i + " is " + mul);

        sc.close();
    }
}
