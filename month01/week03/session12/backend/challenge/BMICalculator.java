import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight (kg): ");
        double weight = sc.nextDouble();
        System.out.println("Please enter your height (m): ");
        double height = sc.nextDouble();
        double bmi = weight/(height*height);
        String category = "";

        if (weight < 0 || height <0 || height >3) {
            System.out.println("Wrong value. Enter right!");
        } else{
            if (bmi < 18.5) {
                category = "Thin";
            } else if (bmi >= 18.5 && bmi <=24.9) {
                category = "Normal";
            }else if (bmi >= 25 && bmi <=29.9) {
                category = "Overweight";
            } else{
                category ="Obese";
            }
            System.out.println("Height(m): " + height);
            System.out.println("Weight(kg): " + weight);
            System.out.println("Your BMI: " + bmi);
            System.out.println("Category: " + category);
        }

        sc.close();
    
    }
}
