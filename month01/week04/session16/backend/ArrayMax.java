

public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 67, 34, 89, 5};

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max is: "+ max);
    }
}
