package src.test.java;
import src.main.java.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    private Queue<Integer> queue;

    @Test
    public void testEnqueue() {
        queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, (long) queue.peek());
    }

    @Test
    public void testDequeue() {
        queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, (long) queue.dequeue());
        assertEquals(20, (long) queue.peek());
    }

    @Test
    public void testPeek() {
        queue = new Queue<>();
        queue.enqueue(10);
        assertEquals(10, (long) queue.peek());
        queue.enqueue(20);
        assertEquals(10, (long) queue.peek());
    }

    @Test
    public void testIsEmpty() {
        queue = new Queue<>();
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        queue = new Queue<>();
        assertEquals(0, (long) queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(2, (long) queue.size());
        queue.dequeue();
        assertEquals(1, (long) queue.size());
    }

    // @Test
    // public void testRemoveEmptyQueue() {
    //     queue = new Queue<>();
    //     assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    // }

    // @Test
    // public void testPeekEmptyQueue() {
    //     queue = new Queue<>();
    //     assertThrows(EmptyQueueException.class, () -> queue.peek());
    // }
}
