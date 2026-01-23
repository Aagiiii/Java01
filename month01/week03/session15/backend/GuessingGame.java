import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int attempts = 0;
        int maxAttempts = 7;
        String playAgain = "y";

        
        while (playAgain.equalsIgnoreCase("y")) {
            System.out.println("=======================");
            System.out.println("GUESSING GAME");
            System.out.println("=======================");
            System.out.println("Түвшин сонгоно уу:");
            System.out.println("1. Амархан (1-50)");
            System.out.println("2. Дунд (1-100)");
            System.out.println("3. Хэцүү (1-200)");
            int level = sc.nextInt();
            int Maxnumber = 0;
            if (level == 1) {
                Maxnumber = 50;
            } else if (level == 1) {
                Maxnumber = 100;
            } else if (level == 1) {
                Maxnumber = 20;
            }
            int randomNum = rm.nextInt(Maxnumber) + 1;
            System.out.println(randomNum);
            while (attempts < maxAttempts) {
                System.out.println(" Please enter the number: ");
                int n = sc.nextInt();
                attempts++;
                if (n < randomNum) {
                    System.out.println("Enter larger number");
                } else if (n > randomNum) {
                    System.out.println("Enter smaller number");
                } else {
                    System.out.println("Match");
                    break;
                }

            }
            System.out.println("Your attempt: " + attempts);
            if (attempts <= 3) {
                System.out.println("Well done!");
            } else if (attempts <= maxAttempts && attempts > 3) {
                System.out.println("Good");
            } else {
                System.out.println("Your attempt is finished .Try again later " + "randdomNum is: " + randomNum);
                // break;
            }
            System.out.println("\n Wanna Play Again?(y/n)");
            playAgain = sc.next();
            System.out.println("test: " + playAgain);

        }
        System.out.println("Goodbye");

        sc.close();
    }
}
