//Practical 5: Write a menu driven program to implement following operations on the singly linked list.
//              (a) Insert a node at the front of the linked list
//              (b) Insert a node at the end of the linked list
//              (c) Insert a node such that linked list is in ascending order
//              (d) Delete a First node of the linked list
//              (e) Delete a node before specified position
//              (f) Delete a node after specified position 

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void insertInAscendingOrder(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
    }

    void deleteNodeBeforePosition(int position) {
        if (head == null || position <= 1) {
            System.out.println("Invalid position or list is empty.");
            return;
        }
        if (position == 2) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 2; i++) {
            if (current.next == null) {
                System.out.println("Position is out of range.");
                return;
            }
            current = current.next;
        }
        current.next = current.next.next;
    }

    void deleteNodeAfterPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        for (int i = 1; i < position; i++) {
            if (current == null) {
                System.out.println("Position is out of range.");
                return;
            }
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("No node after specified position.");
            return;
        }
        current.next = current.next.next;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class practical5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while (true) {
            System.out.println("\nChoice:");
            System.out.println("1. Insert a node at the front");
            System.out.println("2. Insert a node at the end");
            System.out.println("3. Insert a node in ascending order");
            System.out.println("4. Delete the first node");
            System.out.println("5. Delete a node before specified position");
            System.out.println("6. Delete a node after specified position");
            System.out.println("7. Display the linked list");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the front: ");
                    int dataFront = scanner.nextInt();
                    linkedList.insertAtFront(dataFront);
                    break;
                case 2:
                    System.out.print("Enter data to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    linkedList.insertAtEnd(dataEnd);
                    break;
                case 3:
                    System.out.print("Enter data to insert in ascending order: ");
                    int dataAsc = scanner.nextInt();
                    linkedList.insertInAscendingOrder(dataAsc);
                    break;
                case 4:
                    linkedList.deleteFirstNode();
                    break;
                case 5:
                    System.out.print("Enter the position before which you want to delete: ");
                    int positionBefore = scanner.nextInt();
                    linkedList.deleteNodeBeforePosition(positionBefore);
                    break;
                case 6:
                    System.out.print("Enter the position after which you want to delete: ");
                    int positionAfter = scanner.nextInt();
                    linkedList.deleteNodeAfterPosition(positionAfter);
                    break;
                case 7:
                    System.out.println("Linked List:");
                    linkedList.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 8.");
            }
        }
    }
}
