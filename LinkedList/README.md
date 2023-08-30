# LinkedList

Time Complexity: O(n)

A LinkedList is a list of nodes connected in a linear fashion. A chain like structure. The last node in the chain points to null, indicating the end of the list.

`head -> node -> node -> null`

Singly LinkedList: Each node points only to the next node in the sequence.

| Operation             | Time Complexity | Space Complexity |
|-----------------------|-----------------|------------------|
| Insertion (beginning) | O(1)            | O(1)             |
| Insertion (end)       | O(n)            | O(1)             |
| Insertion (middle)    | O(n)            | O(1)             |
| Deletion (beginning)  | O(1)            | O(1)             |
| Deletion (end)        | O(n)            | O(1)             |
| Deletion (middle)     | O(n)            | O(1)             |
| Search                | O(n)            | O(1)             |
| Access by Index       | O(n)            | O(1)             |
| Size                  | O(1)            | O(1)             |

Doubly LinkedList: Each node points both to the next node and the previous node in the sequence. This allows for more efficient traversal in both directions, but it requires more memory since each node has an additional pointer.

| Operation             | Time Complexity | Space Complexity |
|-----------------------|-----------------|------------------|
| Insertion (beginning) | O(1)            | O(1)             |
| Insertion (end)       | O(1)            | O(1)             |
| Insertion (middle)    | O(n)            | O(1)             |
| Deletion (beginning)  | O(1)            | O(1)             |
| Deletion (end)        | O(1)            | O(1)             |
| Deletion (middle)     | O(n)            | O(1)             |
| Search                | O(n)            | O(1)             |
| Access by Index       | O(n)            | O(1)             |
| Size                  | O(1)            | O(1)             |

Pros:

- Dynamic size: They can grow or shrink during runtime easily, unlike fixed-size arrays.

- Insertion and deletion: Inserting or deleting elements can be efficient, especially in the middle of the list, as it only requires adjusting the pointers.

- No memory wastage: Memory is allocated as needed, making it more efficient for dynamic data.

Cons:

Random access: Accessing elements in a LinkedList is slower compared to arrays because you have to traverse the list from the beginning to find a specific element (unless you have a reference to that node).

Additional memory overhead: Each node requires extra memory to store the reference to the next node, which can be significant for large lists.

Singly Linked List Pseudo-code:

```python
# Node class to represent each node in the linked list
class Node:
    def __init__(self, value):
        # Initialize a node with the given value


# LinkedList class to manage the linked list operations
class LinkedList:
    def __init__(self):
        # Initialize an empty linked list

    def append(self, value):
        # Append a new node at the end of the linked list

    def prepend(self, value):
        # Prepend a new node at the beginning of the linked list

    def insert_after(self, prev_node, value):
        # Insert a new node after a given previous node

    def delete_node(self, value):
        # Delete a node with the given value from the linked list

    def display(self):
        # Display the elements of the linked list

    def search(self, value):
        # Search for a node with the given value in the linked list

    def access_by_index(self, index):
        # Access the value of the node at the given index in the linked list

    def size(self):
        # Get the number of nodes in the linked list

```

Built-In Packages:

*Note: Java and Go have doubly-linked list implementations*

- Python - None

- Java - java.util.LinkedList
    ```
    import java.util.LinkedList;

    public class Main {
        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);

            System.out.println(linkedList); // Output: [1, 2, 3]
        }
    }
    ```

- Go - container/list

    ```
    package main

    import (
    	"container/list"
    	"fmt"
    )

    func main() {
    	myList := list.New()

    	myList.PushBack(1)
    	myList.PushBack(2)
    	myList.PushBack(3)

    	for element := myList.Front(); element != nil; element = element.Next() {
    		fmt.Println(element.Value)
    	}
    }
    ```