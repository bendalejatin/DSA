//Name: Jatin Bendale
//Enrollment No: 202203103510038
//Practical 4: Write a program to implement Queue using arrays that performs following operations.(a) INSERT (b) DELETE (c) DISPLAY 

public class practical4 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public practical4(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value) {
        if (rear == maxSize - 1) { 
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public int delete() {
        int temp = queueArray[front++];
        if (front == maxSize) { 
            front = 0;
        }
        nItems--;
        return temp;
    }

    public void display() {
        int current = front;
        int itemsDisplayed = 0;
        while (itemsDisplayed < nItems) {
            System.out.print(queueArray[current++] + " ");
            if (current == maxSize) { 
                current = 0;
            }
            itemsDisplayed++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        practical4 queue = new practical4(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        System.out.println("The Queue after inserting 10, 20, 30, 40:");
        queue.display(); // Display: 10 20 30 40

        queue.delete();
        System.out.println("The Queue after delete operation:");
        queue.display(); // Display: 20 30 40

        queue.insert(50);
        queue.insert(60);
        System.out.println("The Queue after inserting 50, 60:");
        queue.display(); // Display: 20 30 40 50 60
    }
}
