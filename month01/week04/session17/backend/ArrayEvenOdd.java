

public class ArrayEvenOdd {
    public static void main(String[] args) {
         int[] numbers = {12, 7, 24, 15, 8, 33, 42, 19, 6};
         System.out.println("Even is: ");
         for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0) {
                System.out.println(numbers[i] + " ");
            }
         }
         System.out.println();

         System.out.println("Odd is ");
         for (int num : numbers) {
            if (num%2!=0) {
                System.out.println(num + " ");
            }
         }
         System.out.println();

         int evenCount=0;
         int oddCount=0;
         for (int num : numbers) {
            if (num%2==0) {
                evenCount++;
            }else{
                oddCount++;
            }
         }
         System.out.println("Even Num: " + evenCount + " pieces");
         System.out.println("Odd Num: " + oddCount + " pieces");
    }
}
