package src.main.java;

public class LinkedList {
    public Node head;

    public static class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Append a new node with the given value at the end of the linked list
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Prepend a new node with the given value at the beginning of the linked list
    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert a new node with the given value after the given node
    public void insertAfter(Node prevNode, int value) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete a node with the given value from the linked list
    public void deleteNode(int value) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        if (head.value == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("Data not found in the linked list.");
    }

    // Search for a node with the given value in the linked list
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Access the value of the node at the given index in the linked list
    public int accessByIndex(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.value;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }

    // Get the number of nodes in the linked list
    public int size() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Display the contents of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.prepend(5);
        linkedList.insertAfter(linkedList.head.next, 15);
        linkedList.deleteNode(20);
        linkedList.search(15);
        linkedList.accessByIndex(2);
        linkedList.size();
        linkedList.display();
    }
}
