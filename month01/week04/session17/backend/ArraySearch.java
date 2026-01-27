import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String[] students = {"Бат", "Болд", "Дорж", "Сүхээ", "Төгс"};
         System.out.println("Insert name you wanna find: ");
         String searchName = sc.nextLine();

         int foundIndex = -1;
         for (int i = 0; i < students.length; i++) {
            if (students[i].equals(searchName)) {
                foundIndex=1;
                break;
            }
         }

         if (foundIndex!=-1) {
            System.out.println(searchName + " found! Index: "+ foundIndex);
         }else{
            System.out.println(searchName + " not found");
         }

         sc.close();
    }
}
