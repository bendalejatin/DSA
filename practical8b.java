//Name: Jatin Bendale
//Enrollment No: 202203103510038
//Practical 8b: Implementation of Searching techniques. (b) Binary Search

// implementation of Binary Search
import java.util.Scanner;
public class practical8b {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index if target is found
            } else if (arr[mid] < target) {
                left = mid + 1; // If target is greater, search the right half
            } else {
                right = mid - 1; // If target is smaller, search the left half
            }
        }
        return -1; // Return -1 if target is not found
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (in sorted order):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nEnter the target element to search:");
        int target = scanner.nextInt();
        
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("\nElement found at index: " + index);
        } else {
            System.out.println("\nElement not found in the array.");
        }

        scanner.close();
    }
}