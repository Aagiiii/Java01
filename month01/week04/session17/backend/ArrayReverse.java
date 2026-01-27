

public class ArrayReverse {
    public static void main(String[] args) {
         int[] numbers = {10, 20, 30, 40, 50};
         System.out.println("Normal: ");
         for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
         }
         System.out.println();
         System.out.println("Inverse: ");
         for (int i = numbers.length-1; i >=0; i--) {
             System.out.println(numbers[i] + " ");
         }
         System.out.println();
    }
}
