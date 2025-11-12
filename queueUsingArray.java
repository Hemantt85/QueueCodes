// Queue implementation using array in Java
// Program includes all basic operations: Enqueue, Dequeue, Peek, Display, and Check (isFull / isEmpty)


// alorithm of enqueue operation: 
// 1. Check if the queue is full(rear == MAX - 1). If it is, print "Queue is Full (Overflow)" and return.
// 2. If the queue is empty (front == -1), set front to 0.
// 3. Increment rear by 1.  
// 4. Insert the new item at the position rear in the queue array.
// 5. Increment size by 1.

// if (rear == MAX - 1)
//     print "Queue is Full (Overflow)"
// else
//     rear = rear + 1
//     queue[rear] = item


// alorithm of dequeue operation:
// 1. Check if the queue is empty (front == -1 || front > rear). If it is, print "Queue is Empty (Underflow)" and return.
// 2. Print the element at the front of the queue (queue[front]) as
//    the deleted element.
// 3. Increment front by 1.

// if (front > rear)
//     print "Queue is Empty (Underflow)"
// else
//     item = queue[front]
//     front = front + 1


// alorithm of peek operation:
// 1. Check if the queue is empty (front == -1 || front > rear
//. If it is, print "Queue is Empty" and return.
// 2. Print the element at the front of the queue (queue[front]) as
//    the front element.

// if (front > rear)
//     print "Queue is Empty"
// else
//     print queue[front]


// alorithm of display operation:
// 1. Check if the queue is empty (front == -1 || front > rear). If it is, print "Queue is Empty" and return.
// 2. Iterate from front to rear and print each element in the queue.
// if (front > rear)
//     print "Queue is Empty"   
// else
//     for i from front to rear
//         print queue[i]

import java.util.Scanner;

class Queue {
    private int front, rear, size;
    private int[] queue;
    private final int MAX;  // maximum capacity of queue

    // Constructor to initialize queue
    Queue(int capacity) {
        MAX = capacity;
        queue = new int[MAX];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Function to check if queue is full
    boolean isFull() {
        return rear == MAX - 1;
    }

    // Function to check if queue is empty
    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Function to insert (enqueue) an element in queue
    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full (Overflow)");
        } else {
            if (front == -1) front = 0;  // first insertion
            rear++;
            queue[rear] = item;
            size++;
            System.out.println("Inserted -> " + item);
        }
    }

    // Function to delete (dequeue) an element from queue
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty (Underflow)");
        } else {
            System.out.println("Deleted -> " + queue[front]);
            front++;
            size--;
        }
    }

    // Function to return front element (peek)
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element -> " + queue[front]);
        }
    }

    // Function to display all elements of queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Function to return size of queue
    int getSize() {
        return size;
    }
}

public class queueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();

        Queue q = new Queue(capacity);

        while (true) {
            System.out.println("\n--- Queue Menu ---");
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


