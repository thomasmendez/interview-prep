package src.main.java;
import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> items;

    public Queue() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(T item) {
        items.add(item);
    }

    public T dequeue() {
        if (!isEmpty()) {
            return items.remove(0);
        } else {
            throw new IndexOutOfBoundsException("Queue is empty. Cannot dequeue from an empty queue.");
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return items.get(0);
        } else {
            throw new IndexOutOfBoundsException("Queue is empty. Cannot dequeue from an empty queue.");
        }
    }

    public int size() {
        return items.size();
    }

    public static void main(String[] args) {
        // Create a new queue
        Queue<Integer> queue = new Queue<>();

        // Push elements onto the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Get the first element (peek)
        System.out.println(queue.peek()); // Output: 10

        // Remove an element from the queue
        System.out.println(queue.dequeue()); // Output: 10

        // Check if the queue is empty
        System.out.println(queue.isEmpty()); // Output: false

        // Get the current size of the queue
        System.out.println(queue.size()); // Output: 2
    }
}
