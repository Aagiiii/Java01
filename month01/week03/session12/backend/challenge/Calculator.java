import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Please enter second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Please enter operation: ");
        String op = sc.next();
        boolean valid = true;
        double result = num1;

        if (op.equals("+")) {
            result = num1 + num2;
        } else if (op.equals("-")) {
            result = num1 - num2;
        } else if (op.equals("*")) {
            result = num1 * num2;
        } else if (op.equals("/")) {
            if (num2 == 0) {
                System.out.println("Impossible to divide by zero");
                valid = false;
                return;
            } else {
                result = num1 / num2;

            }

        } else {
            valid = false;
            System.out.println("Wrong operator: " + op);
            return;
        }

        System.out.println("=== Calculator ===");
        System.out.println("firstNum: " + num1);
        System.out.println("SecondtNum: " + num2);
        System.out.println("Operation: " + op);
        System.out.println("Result: " + result);

        sc.close();

    }
}
