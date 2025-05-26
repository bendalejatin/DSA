//Name: Jatin Bendale
//Enrollment No: 202203103510038
//Practical 7a: Implementation of Sorting techniques. (a) Bubble Sort

// implementation of Bubble Sort
import java.util.Scanner;
class practical7a {
    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    System.out.println("Swapped: ( " + arr[j] + " , " + arr[j + 1] +" )");
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }
    // Function to print an array
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver program
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        bubbleSort(arr, n);
        System.out.println("\nSorted array: ");
        printArray(arr, n);
    }
}