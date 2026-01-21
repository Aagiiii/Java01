

public class Loops {
    public static void main(String[] args) {
        // While loop
        int count =1 ;
        while (count <=10) {
            System.out.println(count);
            count = count +1;
        }

        // sum of 100

        int num =1;
        int sum =0;
        while (num <=100) {
            sum +=num;
            num++;
        }
        System.out.println(" 1-100 sum is: " + sum);

        // FOR loop

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        // sum of 100
        int sum1=0;
        for (int i = 1; i <=100; i++) {
            sum1+=i;
        }
        System.out.println(" FOR LOOP sum is "+ sum1);
    }
}
