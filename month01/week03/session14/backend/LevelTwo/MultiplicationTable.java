import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Insert size of table : ");
     int n = sc.nextInt();

     for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n; j++) {
            System.out.printf("%4d", i*j);
        }
        System.out.println();
     }
     sc.close();
    }
}
