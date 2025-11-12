// Queue implementation using Linked List in Java
// This program includes all main operations: Enqueue, Dequeue, Peek, Display

import java.util.Scanner;

// Node class to represent each element of the queue
class Node {
    int data;        // data part
    Node next;       // pointer to next node

    // constructor to initialize node
    Node(int item) {
        data = item;
        next = null;
    }
}

// Queue class using linked list
class LinkedQueue {
    Node front, rear;  // pointers for first and last node
    int size;          // to keep track of queue size

    // constructor
    LinkedQueue() {
        front = rear = null;
        size = 0;
    }

    // Function to check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Function to insert element at rear (Enqueue)
    void enqueue(int item) {
        Node newNode = new Node(item);  // create a new node
        if (rear == null) {             // if queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;        // link new node after rear
            rear = newNode;             // update rear
        }
        size++;
        System.out.println("Inserted -> " + item);
    }

    // Function to remove element from front (Dequeue)
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty (Underflow)");
            return;
        }
        System.out.println("Deleted -> " + front.data);
        front = front.next;  // move front to next node
        size--;

        if (front == null)   // if queue becomes empty
            rear = null;
    }

    // Function to view front element (Peek)
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element -> " + front.data);
        }
    }

    // Function to display all elements of queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            Node temp = front;
            System.out.print("Queue Elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Function to return queue size
    int getSize() {
        return size;
    }
}

// Main class
public class queueUsingLL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedQueue q = new LinkedQueue();

        while (true) {
            System.out.println("\n--- Queue Menu (Linked List Implementation) ---");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Peek (Front Element)");
            System.out.println("4. Display Queue");
            System.out.println("5. Size of Queue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int item = sc.nextInt();
                    q.enqueue(item);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.println("Current Queue Size: " + q.getSize());
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

