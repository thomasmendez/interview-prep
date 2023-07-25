package src.test.java;
import src.main.java.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    private Stack<Integer> stack;

    @Test
    public void testPush() {
        stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, (long) stack.peek());
    }

    @Test
    public void testPop() {
        stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, (long) stack.pop());
        assertEquals(10, (long) stack.peek());
    }

    @Test
    public void testPeek() {
        stack = new Stack<>();
        stack.push(10);
        assertEquals(10, (long) stack.peek());
        stack.push(20);
        assertEquals(20, (long) stack.peek());
    }

    @Test
    public void testIsEmpty() {
        stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        stack = new Stack<>();
        assertEquals(0, (long) stack.size());
        stack.push(10);
        stack.push(20);
        assertEquals(2, (long) stack.size());
        stack.pop();
        assertEquals(1, (long) stack.size());
    }

    // @Test
    // public void testPopEmptyStack() {
    //     stack = new Stack<>();
    //     assertThrows(EmptyStackException.class, () -> stack.pop());
    // }

    // @Test
    // public void testPeekEmptyStack() {
    //     stack = new Stack<>();
    //     assertThrows(EmptyStackException.class, () -> stack.peek());
    // }
}
