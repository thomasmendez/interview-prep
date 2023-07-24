package src.main.java;

public class LinkedList {
    public Node head;

    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Append a new node with the given data at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);
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

    // Prepend a new node with the given data at the beginning of the linked list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a new node with the given data after the given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete a node with the given data from the linked list
    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data == data) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("Data not found in the linked list.");
    }

    // Search for a node with the given data in the linked list
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Access the data of the node at the given index in the linked list
    public int accessByIndex(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
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
            System.out.print(current.data + " -> ");
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
