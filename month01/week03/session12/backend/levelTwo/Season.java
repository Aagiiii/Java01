import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter months (1-12): ");
        int month = sc.nextInt();
        String season = "";
        if (month > 12 || month < 1) {
            System.out.println("It is not month. Please try again");
        } else{
            if (month>2 && month <6) {
                season ="Spring";
            } else  if (month>5 && month <9) {
                season ="Summer";
            }else  if (month>8 && month <12) {
                season ="Fall";
            }else{
                season= "Winter";
            }
        }
        System.out.println("Season is: " + season);

        sc.close();
    }
}
