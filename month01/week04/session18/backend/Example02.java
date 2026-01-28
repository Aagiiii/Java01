
public class Example02 {
    public static void main(String[] args) {
        System.out.println("Function with return type");
        // int resultOne = returnOne();
        // System.out.println(resultOne);
        // System.out.println(returnPi());
        // System.out.println(returnHello());
        int sum = addTwoNumbers(5, 6);
        int sub = substractNumbers(10, 5);
        double zeroD = divideTwoNumbers(10, 0);
        double div = divideTwoNumbers(5, 2);
        int mod = findRestModule(5, 2);
        int exp = exponentOfNumbers(2, 0);
        System.out.println("sum " + sum);
        System.out.println("sub " + sub);
        System.out.println("zerod " + zeroD);
        System.out.println("div " + div);
        System.out.println("mod " + mod);
        System.out.println("exp " + exp);

    }

    public static int returnOne() {
        return 1;
    }

    public static double returnPi() {
        return 3.14;
    }

    public static String returnHello() {
        return "hello";
    }

    public static int addTwoNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int substractNumbers(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiplyNumbers(int a, int b) {
        int result = a * b;
        return result;
    }

    public static double divideTwoNumbers(int a, int b) {

        if (b == 0) {
            return -1;

        } else {
            return a / b;
        }

    }

    public static int findRestModule(int a, int b) {
        int result = a % b;
        return result;
    }

    public static int exponentOfNumbers(int a, int b) {
        int result =1;
        for (int i = 0; i < a; i++) {
           result= result*b;
        }
     
        return result;
    }

}
