import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        String category = "" ;
        if (age >=0 && age < 13) {
            category = "Kid";
        }else if (age >=13 && age < 20) {
            category = "Teen";
        }else if (age >=20 && age < 60) {
            category = "Adult";
        }else if(age >=60){
            category= "Old";
        } else{
            System.out.println("Wrong Age");
        }
        System.out.println("Age category is: " + category);
        sc.close();
    }
}
