import java.util.Scanner;
import java.util.Arrays;


public class ArrayProcessor {

     public static void printArray(int[] arr){

            System.out.print("[");

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            System.out.println("]");
        }
//

public static int sum(int[] arr){
    int total =0;
    for (int i : arr) {
        total += i;
    }
    return total;
}
// average 
public static double average(int[] arr){
    return sum(arr)/arr.length;
}

public static int max (int[] arr){
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
public static int min (int[] arr){
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

public static int search(int[] arr, int target){
    if (arr.length==0) return 0;
    for (int i = 0; i < arr.length; i++) {
        if (target == arr[i]) {
            System.out.println("target is:" + target);
        } else{
            System.out.println("Not Found");
        }
    }
}

// Элемент нэмэх (шинэ array буцаах)
    public static int[] addElement(int[] arr, int element) {
        
    }

    // Элемент устгах (index-ээр)
    public static int[] removeElement(int[] arr, int index) {
        // TODO
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        // TODO
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {23,45,12,67,34,89,11};
        int choice;

        do{
            printMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Current Array: ");
                    printArray(numbers);
                    break;
                 case 2:
                    System.out.print("Enter element to add: ");
                    int newElement = sc.nextInt();
                    numbers = addElement(numbers, newElement);
                    System.out.println("Element added!");
                    printArray(numbers);
                    break;
                 case 3:
                    System.out.print("Enter index to remove: ");
                    int index = sc.nextInt();
                    numbers = removeElement(numbers, index);
                    printArray(numbers);
                    break;
                case 4:
                    System.out.println("Sum: " + sum((numbers)));
                    break;
                case 5:
                    System.out.printf("Average: %.2f%n", average(numbers));
                    break;
                case 6:
                    System.out.println("Max: " + max(numbers));
                    break;
                case 7:
                    System.out.println("Min: " + min(numbers));
                    break;
                case 8:
                    System.out.print("Enter element to search: ");
                    int target = sc.nextInt();
                    int result = search(numbers, target);
                    if (result !=-1) {
                        System.out.println("Found at index: " + result);
                    } else{
                        System.out.println("Element not found!");
                    }
                    break;
                case 9:
                    bubbleSort(numbers);
                    System.out.println("Array sorted!");
                    printArray(numbers);
                    break;
                
                case 10:
                    printStastistics(numbers);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
            
        } while(choice !=0);
        sc.close();

       
    }

public static void printStastistics(int[] numbers) {
        // TODO Auto-generated method stub
       
    }

  public static void printMenu() {
      System.out.println("\n========================================");
        System.out.println("         ARRAY PROCESSOR v1.0");
        System.out.println("========================================");
        System.out.println("1. View Array");
        System.out.println("2. Add Element");
        System.out.println("3. Remove Element");
        System.out.println("4. Calculate Sum");
        System.out.println("5. Calculate Average");
        System.out.println("6. Find Maximum");
        System.out.println("7. Find Minimum");
        System.out.println("8. Search Element");
        System.out.println("9. Sort Array");
        System.out.println("10. Statistics (All)");
        System.out.println("0. Exit");
        System.out.println("========================================");
        System.out.print("Enter choice: ");
    }
}
