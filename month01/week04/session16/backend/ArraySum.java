

public class ArraySum {
    public static void main(String[] args) {
        int[] scores ={85,90,78,92,88};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("Sum is: "+ sum);

        double average = sum /scores.length;
        System.out.println("Average: " + average);
    }
}
