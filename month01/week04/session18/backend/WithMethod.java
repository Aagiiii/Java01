package month01.week04.session18.backend;

public class WithMethod {
    public static void main(String[] args) {
        // function call
        printAverage("Student 1", 85, 90, 78);
        printAverage("Student 2", 92, 88, 95);
        printAverage("Student 3", 70, 75, 80);
        

    }

    // function def - class method definition
    // function parameters
    public static void printAverage(String name, int a, int b, int c) {
        double avg = (a+b+c)/3.0;
        System.out.println(name + "average" + avg);
    }
}
