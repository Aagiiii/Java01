import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jane");
        names.add("Jack");
        names.add("Joy");
        names.add("Joly");
        names.add("John");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int sum =0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum is: " + sum);

        numbers.set(2, 5);
        names.contains("Banana");

        ArrayList<Double> scores = new ArrayList<>();
        scores.add(90.0);
        scores.add( 81.);
        scores.add( 70.);
        scores.add( 65.);
        int sum1 = 0;
        double average ;
        for (int i = 0; i < scores.size(); i++) {
            sum1 += scores.get(i);
            
        }
        average =sum1/scores.size();
        System.out.println("Average: " + average);
        
        double max =scores.get(0);
          for (int i = 0; i < scores.size(); i++) {
            if (max< scores.get(i)) {
                max =scores.get(i);
            }
            if (scores.get(i) >=80) {
                System.out.println(scores.get(i));
            }
            
        
        }
        System.out.println("======");
        System.out.println("Max is " + max);


    }
}
