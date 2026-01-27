

public class ArrayBasics {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "strawberry", "seabucktorn", "dried grape"};
        System.out.println("First fruit: " +fruits[0]);
        System.out.println("Last fruit: " +fruits[fruits.length-1]);
        System.out.println("Total length of arrray is: "+ fruits.length);
        fruits[2]= "Watermelon";
        System.out.println("third new one: " + fruits[2]);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i+1) + "." +fruits[i]);
        }
        System.out.println("\n=== For-each===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
