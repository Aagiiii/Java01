

public class ArraySumAverage {
    public static void main(String[] args) {
         int[] scores = {85, 92, 78, 95, 88, 76, 90};
         int sum =0;
         for (int i : scores) {
            sum+=i;
         }
         System.out.println("Sum is: "+ sum);
         double average = (double)sum/scores.length;
          System.out.println("Average is: "+ average);
          System.out.printf("Average 2 : %.2f%n", average);
    }
}
