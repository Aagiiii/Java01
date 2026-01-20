import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Grade System ===");
        System.out.println("Please input the score (0-100)");
        int score = scanner.nextInt();

        String assesment = "";
        String text = "";
        if (score < 0 || score > 100) {
            System.out.println("The grade must be between 0 and 100");
        } else{
            if (score > 89 && score <=100) {
                assesment = "A";
                text ="GREAT!";
               
            } else  if (score >79 && score <=89) {
                 assesment = "B";
                text ="Good Job!";
            }else  if (score >69 && score <=79) {
                assesment = "C";
                text ="Good!";
            }else  if (score >59 && score <=69) {
                 assesment = "D";
                text ="DO IT BETTER NEXT TIME!!";
               
            }else{
                 assesment = "F";
                text ="TRY AGAIN!";
              
            }
        }
        System.out.println("=== Result ===");
        System.out.println("Grade: " +score);
        System.out.println("Assessment: " + assesment);
        System.out.println(text);
        scanner.close();
    }
}
