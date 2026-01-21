
public class LoopsExercise {
    public static void main(String[] args) {

        // 1-10 хэвлэх
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 10-1 хэвлэх (буурах)
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 5-ийн үржвэрүүд (5, 10, 15, 20, 25)

        for (int i = 5; i <= 25; i+=5) {
            System.out.println(i);
        }

        // 1-50 хүртэлх тоонуудын нийлбэр тооцоол:
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("1-50 sum is: " + sum);

        // 1-5 хэвлэх while ашиглан
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i=i+1;
        }

        // // 1-10 хэвлэх, гэхдээ 7 дээр зогсоох
        for (int j = 1; j <= 10; j++) {
            if (j==7) {
                break;
            }
            System.out.println(j);
        }

        // // 1-10 хэвлэх, гэхдээ тэгш тоонуудыг алгасах
        for (int j = 1; j < 10; j++) {
            if (j%2==0) {
                continue;
            }
            System.out.println("=== 1-10 хэвлэх, гэхдээ тэгш тоонуудыг алгасах==");
            System.out.println(j);
        }

    }

}
