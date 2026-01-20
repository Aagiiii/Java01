import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total amount of your purchase: ");
        double purchase = sc.nextInt();

        double discount = purchase;
        double total = purchase;

        if (purchase < 0) {
            System.out.println("Wrong value.Try agin!");
        } else {
            if (purchase < 20000) {
                discount = 0;
                total = purchase;
            } else if (purchase >= 20000 && purchase < 50000) {
                discount = purchase * 0.05;
                total = purchase - discount;

            } else if (purchase >= 50000 && purchase < 100000) {
                discount = purchase * 0.1;
                total = purchase - discount;

            } else {
                discount = purchase * 0.15;
                total = purchase - discount;
            }
            System.out.println("Purchase amount is: " + purchase);
            System.out.println("==== Info of Payment ===");
            System.out.println("original payment is: " + purchase);
            System.out.println("discount is: " + discount);
            System.out.println("total payment is: " + total);
        }

        sc.close();
    }
}
