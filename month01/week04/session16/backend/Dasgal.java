

public class Dasgal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("First element is: " + numbers[0]);
        System.out.println("Last: " + numbers[numbers.length-1]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
