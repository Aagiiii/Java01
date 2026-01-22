import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert num: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            String line = "";
            for (int j = 1; j <=i; j++) {
                line = line +"*";
            }
           System.out.println(line);
        }
    }
}
