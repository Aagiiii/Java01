import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number :");

        int num2 = sc.nextInt();
        System.out.println("Please enter third number :");

        int num3 = sc.nextInt();

      int maxNum = num1;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum=num2;
        } else{
           maxNum=num3;}

           System.out.println("firstNum is: " + num1);
           System.out.println("secondNum is: " + num2);
           System.out.println("thirdNum is: " + num3);
           System.out.println("maxNum is: " + maxNum);
        sc.close();
    }
}
