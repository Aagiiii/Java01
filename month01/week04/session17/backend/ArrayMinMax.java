

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] temperatures = {-5, 12, 8, -10, 25, 18, 3, -2};
        int max = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }
        System.out.println("Maximum temperature is: "+max + "C");

        int min = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i]<min) {
                min=temperatures[i];
            }
        }
         System.out.println("Minimum temperature is: "+min + "C");

         int difference = max- min ;
         System.out.println("Difference temperature is: "+ difference + "C");
    }
}
