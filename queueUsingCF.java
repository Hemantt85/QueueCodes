//Using LinkedList as Queue in collections framework
// import java.util.LinkedList;
// import java.util.Queue;

// public class queueUsingCF {
//     public static void main(String[] args) {
//         // Create a Queue using LinkedList
//         Queue<Integer> queue = new LinkedList<>();

//         // Enqueue elements
//         queue.add(10);  // can also use queue.offer(10);
//         queue.add(20);
//         queue.add(30);

//         System.out.println("Queue: " + queue);

//         // Peek front element
//         System.out.println("Front element: " + queue.peek());

//         // Dequeue elements
//         int removed = queue.remove();  // or queue.poll();
//         System.out.println("Removed element: " + removed);

//         System.out.println("Queue after removal: " + queue);

//         // Iterate through queue
//         System.out.print("Iterating queue: ");
//         for (int num : queue) {
//             System.out.print(num + " ");
//         }
//     }
// }











//using PriorityQueue from collections framework
// import java.util.PriorityQueue;
// import java.util.Queue;

// public class queueUsingCF {
//     public static void main(String[] args) {
//         Queue<Integer> pq = new PriorityQueue<>();

//         pq.add(50);
//         pq.add(10);
//         pq.add(30);

//         System.out.println("Priority Queue: " + pq);

//         System.out.println("Head element: " + pq.peek());

//         pq.poll();  // removes smallest element
//         System.out.println("After poll: " + pq);
//     }
// }













//Using ArrayDeque as Queue from collections framework

// import java.util.ArrayDeque;
// import java.util.Queue;

// public class queueUsingCF {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new ArrayDeque<>();

//         queue.add(100);
//         queue.add(200);
//         queue.add(300);

//         System.out.println("Queue: " + queue);
//         System.out.println("Peek: " + queue.peek());

//         queue.poll();
//         System.out.println("After poll: " + queue);
//     }
// }














Advantages of Queue in Collection Framework

// No need to manage array size manually.

// Dynamic sizing (LinkedList / ArrayDeque grows automatically).

// Multiple implementations: FIFO (LinkedList), Priority (PriorityQueue), Deque (ArrayDeque).

// Provides built-in methods for enqueue, dequeue, and peek.

// Thread-safe variant available: ConcurrentLinkedQueue.

Disadvantages

// Slightly more overhead than primitive array implementation (extra objects & pointers).

// PriorityQueue does not strictly follow FIFO.

// Need to understand different implementations (LinkedList, ArrayDeque, PriorityQueue) for correct use.












// 1️⃣ LinkedList Queue
// ✅ Features / Advantages


// Implements Queue interface in Java.


// Maintains FIFO order strictly.


// Dynamic size — grows or shrinks automatically.


// Can be used as Queue or Deque (double-ended queue).


// Supports all queue operations: add(), offer(), remove(), poll(), peek(), element().


❌ Disadvantages


// Slightly slower than ArrayDeque due to storing extra node pointers.


// Memory usage is higher (each element stores a reference to the next node).


// Accessing elements by index is not possible directly.



2️⃣ ArrayDeque Queue
✅ Features / Advantages


// Implements Queue interface using resizable array.


// Maintains FIFO order strictly.


// Faster than LinkedList because elements are stored in a continuous array.


// Can be used as Queue or Stack (push/pop at ends).


// No capacity restrictions — array grows automatically.


❌ Disadvantages


// Slightly more complex to implement behind the scenes (circular array logic).


// Accessing elements in the middle requires iteration.


// Not thread-safe (use ConcurrentLinkedDeque for thread safety).

3️⃣ PriorityQueue
✅  Advantages


// Implements Queue interface but orders elements based on priority instead of insertion order.


// By default, min-heap ordering (smallest element at the head).


// Supports operations: add(), offer(), poll(), peek().


// Useful for tasks like job scheduling, Dijkstra’s algorithm, etc.


// Dynamic size — grows as needed.


❌ Disadvantages


// Does not maintain strict FIFO order.


// Cannot contain null elements.


// Iteration order is not predictable (elements are internally heap-ordered).


// Slightly slower than ArrayDeque for normal queue operations because of heap structure.



