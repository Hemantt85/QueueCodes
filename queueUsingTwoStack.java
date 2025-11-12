// 🌟 Concept

// We use two stacks, stack1 and stack2, to implement a queue:

// Enqueue (add) → Push element into stack1.

// Dequeue (remove) →

// If stack2 is empty, pop all elements from stack1 and push them into stack2.

// Pop the top element from stack2.

// ✅ This ensures FIFO order using LIFO stacks.


import java.util.Stack;
import java.util.Scanner;

class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int item) {
        stack1.push(item);
        System.out.println("Inserted -> " + item);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is Empty (Underflow)");
                return -1;
            }
            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int removed = stack2.pop();
        System.out.println("Deleted -> " + removed);
        return removed;
    }

    // Peek front element
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

// Main class to test the queue
public class queueUsingTwoStack {
    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Queue using Two Stacks ---");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Remove)");
            System.out.println("3. Peek (Front Element)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int item = sc.nextInt();
                    queue.enqueue(item);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    int front = queue.peek();
                    if (front != -1) {
                        System.out.println("Front Element -> " + front);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}



















// 🧠 Explanation
// 1️⃣ Enqueue Operation

// Push the new element into stack1.

// Time Complexity: O(1)

// 2️⃣ Dequeue Operation

// If stack2 is empty → move all elements from stack1 to stack2.

// Pop the top element from stack2 (this is the front of the queue).

// Time Complexity: Amortized O(1), Worst Case O(n)

// 3️⃣ Peek Operation

// Similar to dequeue but without removing the element.

// 4️⃣ isEmpty Operation

// Queue is empty only if both stacks are empty.

//OUTPUT
    // Enqueue 10
    // Enqueue 20
    // Peek -> 10
    // Dequeue -> 10
    // Peek -> 20
    // Dequeue -> 20
    // Queue is empty




// ✅ Advantages

// Simulates FIFO queue using LIFO stacks.

// Useful when only stack data structures are allowed.

// ❌ Disadvantages

// Dequeue operation may require moving n elements → O(n) in worst case.