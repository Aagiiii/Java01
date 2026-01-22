import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert num : ");
        int n = sc.nextInt();
       
        for (int i = n; i >=1; i--) {
             String line = "";
            for (int j = 1; j<=i; j++) {
                line = line + "*";
            }
            System.out.println(line);
        }
    }
}
