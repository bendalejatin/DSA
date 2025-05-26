//Name: Jatin Bendale
//Enrollment No: 202203103510038
//Practical 1: Implementation of Array operations - Insert, Delete, Search, Update, and Display. 

public class practical1 {
    int[] array;
    int size;

    public practical1(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void insert(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("Index out of range.");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            array[index] = 0;
        } else {
            System.out.println("Index out of range.");
        }
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void update(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("Index out of range.");
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enrollment No: 202203103510038");

        practical1 arr = new practical1(5);
        System.out.println("Array created.");
        System.out.println("Insert the 10, 20, 30 in array: ");
        arr.insert(0, 10);
        arr.insert(1, 20);
        arr.insert(2, 30);
        arr.display();
        System.out.println("Delete the element on the index 1: ");
        arr.delete(1);
        arr.display(); 
        System.out.println("Search the index value of 30: ");
        System.out.println(arr.search(30));
        System.out.println("Update the value at index 2 with 40: ");
        System.out.print("Previous array : ");
        arr.display(); 
        arr.update(2, 40);
        System.out.print("Updated array : ");
        arr.display(); 
        System.out.println("Display the array: ");
        arr.display(); 
    }
}
