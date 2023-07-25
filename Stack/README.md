# Stack

Time Complexity: O(n)
Space Complexity: O(1)

| Operation         | Time Complexity | Space Complexity |
|-------------------|-----------------|------------------|
| Push              | O(1)            | O(1)             |
| Pop               | O(1)            | O(1)             |
| Peek (Top)        | O(1)            | O(1)             |
| Search (in Stack) | O(n)            | O(1)             |
| Is Empty?         | O(1)            | O(1)             |
| Size              | O(1)            | O(1)             |

Stack Pseudo-code:

```python
# Node class to represent each node in the linked list
class Node:
    def __init__(self, data):
        # Initialize a node with the given data


# LinkedList class to manage the linked list operations
class LinkedList:
    def __init__(self):
        # Initialize an empty linked list

    def append(self, data):
        # Append a new node at the end of the linked list

    def prepend(self, data):
        # Prepend a new node at the beginning of the linked list

    def insert_after(self, prev_node, data):
        # Insert a new node after a given previous node

    def delete_node(self, data):
        # Delete a node with the given data from the linked list

    def display(self):
        # Display the elements of the linked list

    def search(self, data):
        # Search for a node with the given data in the linked list

    def access_by_index(self, index):
        # Access the data of the node at the given index in the linked list

    def size(self):
        # Get the number of nodes in the linked list

```