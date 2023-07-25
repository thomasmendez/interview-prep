package src.main.java;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public int size() {
        return items.size();
    }

    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Get the top element (peek)
        System.out.println(stack.peek()); // Output: 30

        // Pop an element from the stack
        System.out.println(stack.pop()); // Output: 30

        // Check if the stack is empty
        System.out.println(stack.isEmpty()); // Output: false

        // Get the current size of the stack
        System.out.println(stack.size()); // Output: 2
    }
}
