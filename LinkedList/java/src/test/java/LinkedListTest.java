package src.test.java;
import src.main.java.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testAppend() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);

        // Add assertions to verify the linked list after appending
        // For example:
        assertEquals("10 -> 20 -> 30 -> 40 -> null", getLinkedListAsString(linkedList));
    }

    @Test
    public void testPrepend() {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(40);
        linkedList.prepend(30);
        linkedList.prepend(20);
        linkedList.prepend(10);

        // Add assertions to verify the linked list after prepending
        // For example:
        assertEquals("10 -> 20 -> 30 -> 40 -> null", getLinkedListAsString(linkedList));
    }

    @Test
    public void testInsertAfter() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);

        // Insert after the node with value 10
        linkedList.insertAfter(linkedList.head, 15);

        // Add assertions to verify the linked list after inserting
        // For example:
        assertEquals("10 -> 15 -> 20 -> 30 -> null", getLinkedListAsString(linkedList));
    }

    @Test
    public void testDeleteNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);

        // Delete the node with value 20
        linkedList.deleteNode(20);

        // Add assertions to verify the linked list after deletion
        // For example:
        assertEquals("10 -> 30 -> null", getLinkedListAsString(linkedList));
    }

    @Test
    public void testSearch() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);

        assertTrue(linkedList.search(20));
        assertFalse(linkedList.search(40));
    }

    @Test
    public void testAccessByIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);

        assertEquals(20, linkedList.accessByIndex(1));
        assertEquals(10, linkedList.accessByIndex(0));

        try {
            linkedList.accessByIndex(5);
            fail("IndexOutOfBoundsException not thrown");
        } catch (IndexOutOfBoundsException e) {
            // Test passed
        }
    }

    @Test
    public void testSize() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.size());

        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        assertEquals(3, linkedList.size());
    }

    // Helper method to convert the linked list to a string for easy comparison
    private String getLinkedListAsString(LinkedList linkedList) {
        StringBuilder sb = new StringBuilder();
        LinkedList.Node current = linkedList.head;
        while (current != null) {
            sb.append(current.value).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
