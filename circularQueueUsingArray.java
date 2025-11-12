// Circular Queue implementation using Array in Java
// Includes all main operations: Enqueue, Dequeue, Peek, Display

import java.util.Scanner;

class CircularQueue {
    private int front, rear, size;
    private int[] queue;
    private int MAX;  // maximum capacity of queue

    // Constructor to initialize queue
    CircularQueue(int capacity) {
        MAX = capacity;
        queue = new int[MAX];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Function to check if queue is full
    boolean isFull() {
        return (front == (rear + 1) % MAX);
    }

    // Function to check if queue is empty
    boolean isEmpty() {
        return (front == -1);
    }

    // Function to insert element (Enqueue)
    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full (Overflow)");
            return;
        }

        // First insertion
        if (front == -1)
            front = 0;

        // Move rear circularly
        rear = (rear + 1) % MAX;
        queue[rear] = item;
        size++;
        System.out.println("Inserted -> " + item);
    }

    // Function to delete element (Dequeue)
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty (Underflow)");
            return;
        }

        System.out.println("Deleted -> " + queue[front]);
        size--;

        // If only one element was present
        if (front == rear) {
            front = rear = -1;
        } else {
            // Move front circularly
            front = (front + 1) % MAX;
        }
    }

    // Function to view front element (Peek)
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element -> " + queue[front]);
        }
    }

    // Function to display queue elements
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % MAX;
        }
        System.out.println();
    }

    // Function to return current size
    int getSize() {
        return size;
    }
}

public class circularQueueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();

        CircularQueue q = new CircularQueue(capacity);

        while (true) {
            System.out.println("\n--- Circular Queue Menu ---");
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



// 1️⃣ Queue using Array (Linear Queue)
// ✅ Advantages

// Simple to implement and understand.

// Insertion and deletion are fast (O(1) at ends).

// Direct access using array index is possible.

// Good when the number of elements is known in advance.

// ❌ Disadvantages

// Fixed size — cannot grow dynamically.

// After multiple deletions, unused space at the front cannot be reused (memory wastage).

// If queue overflows, need to reallocate a bigger array manually.

// Not suitable for dynamic data where size frequently changes.

// // 2️⃣ Circular Queue using Array
// // ✅ Advantages


// // Reuses memory efficiently — no space is wasted after deletions.


// // Fast insertion and deletion (O(1)) using modulo arithmetic.


// // Implementation is still simple compared to linked list.


// // Suitable for fixed-size buffers (like CPU scheduling, I/O buffers).


// // ❌ Disadvantages


// // Size is still fixed — cannot grow dynamically.


// // Needs careful handling of front and rear pointers using modulo operation.


// // Slightly more complex than linear array queue.


// // Direct access to elements is possible but circular logic may confuse beginners.



// // // 3️⃣ Queue using Linked List
// // // ✅ Advantages


// // // Dynamic size — can grow or shrink as needed.


// // // No memory wastage — memory allocated only for actual elements.


// // // Efficient insertion and deletion at ends (O(1)) without worrying about array limits.


// // // Flexible — ideal for queues where number of elements changes frequently.


// // // ❌ Disadvantages


// // // Slightly complex to implement compared to arrays.


// // // Traversing elements is slower — no direct index access.


// // // Each node requires extra memory for pointer/reference.


// // // Memory may be scattered in heap — cache efficiency is lower.



// // // 💡 Quick Note for Exams


// // // Array Queue → Simple, fast, but fixed size and may waste space.


// // // Circular Queue (Array) → Efficient memory reuse, fixed size, good for buffers.


// // // Linked List Queue → Flexible, dynamic, no memory wastage, slightly slower.



// // // If you want, I can also make a single-page visual diagram + notes showing all three types with advantages and disadvantages in points — very handy for your notebook.
// // // Do you want me to make that?







// 💡 Quick Note 

// Array Queue → Simple, fast, but fixed size and may waste space.

// Circular Queue (Array) → Efficient memory reuse, fixed size, good for buffers.

// Linked List Queue → Flexible, dynamic, no memory wastage, slightly slower.