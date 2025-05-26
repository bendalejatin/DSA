//Practical 8a: Implementation of Searching techniques. (a) Sequential Search

// implementation of Sequential Search
import java.util.Scanner;
public class practical8a {
    public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nEnter the target element to search:");
        int target = scanner.nextInt();
        
        int index = sequentialSearch(arr, target);
        if (index != -1) {
            System.out.println("\nElement found at index: " + index);
        } else {
            System.out.println("\nElement not found in the array.");
        }

        scanner.close();
    }
}
