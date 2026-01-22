import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int secretNum = rm.nextInt(100) + 1;
        int guess=0;
        int attempts = 0;
        String result = "";
        while (attempts < 3) {
            System.out.println("Please insert guessNumber: ");
            guess = sc.nextInt();
            if (guess == secretNum) {
                result = "Congratulations";
                break;
            } else {
                System.out.println("It is your " + (attempts +1) + " attempts");
                result = "Try again";
            }
            attempts++;
        }
        System.out.println("=== Game===");
        System.out.println("randomNum is: " + secretNum);
        System.out.println("GuessNum is :" + guess);
        System.out.println(result);

        sc.close();
    }

}
