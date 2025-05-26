//Practical 3: Implement a program for stack that performs following operations using array. 
//(a) PUSH (b) POP (c) PEEP (d) CHANGE (e) DISPLAY 

import java.util.Scanner;

class Stack {
    int MAX_SIZE = 100;
    int top;
    int[] stackArray;

    public Stack() {
        top = -1;
        stackArray = new int[MAX_SIZE];
    }

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to the stack.");
        } else {
            System.out.println("Stack overflow. Cannot push element."); 
        }
    }

    public void pop() {
        if (top >= 0) {
            System.out.println(stackArray[top--] + " popped from the stack.");
        } else {
            System.out.println("Stack underflow. Cannot pop element.");
        }
    }

    public void peep() {
        if (top >= 0) {
            System.out.println("Top element of the stack: " + stackArray[top]);
        } else {
            System.out.println("Stack is empty. Cannot peep.");
        }
    }

    public void change(int index, int newValue) {
        if (index >= 0 && index <= top) {
            stackArray[index] = newValue;
            System.out.println("Value at index " + index + " changed to " + newValue + ".");
        } else {
            System.out.println("Invalid index. Cannot change value.");
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is empty. Nothing to display.");
        }
    }
}

public class practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        
        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("(a) PUSH  (b) POP  (c) PEEP  (d) CHANGE  (e) DISPLAY  (f) EXIT");

            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.print("Enter value to push: ");
                    int valueToPush = scanner.nextInt();
                    stack.push(valueToPush);
                    break;
                case 'b':
                    stack.pop();
                    break;
                case 'c':
                    stack.peep();
                    break;
                case 'd':
                    System.out.print("Enter index to change: ");
                    int indexToChange = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = scanner.nextInt();
                    stack.change(indexToChange, newValue);
                    break;
                case 'e':
                    stack.display();
                    break;
                case 'f':
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
