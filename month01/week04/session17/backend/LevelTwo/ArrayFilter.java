

public class ArrayFilter {
    public static void main(String[] args) {
          int[] ages = {15, 22, 18, 30, 12, 25, 45, 17, 19};
          int threshhold = 18;
          System.out.println(threshhold + "and adult");
          int count =0;
          for (int age : ages) {
            if (age>=threshhold) {
                System.out.println("Age is " + age);
                count++;
            }
          }
          System.out.println("total "+ count + " people");
    }
}
