import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert N: ");
        int n = sc.nextInt();
        int a = 0;
        int b =1;
        System.out.println(a + "" + b + "");
        for (int i = 3; i <=n; i++) {
            int next = a +b;
            System.out.println(next + "");
            a = b;
            b = next;
        }
        sc.close();
    }
}
