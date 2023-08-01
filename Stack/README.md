# Stack

Time Complexity: O(n)
Space Complexity: O(n)

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
class Stack:
    def __init__(self):
        # Initialize an empty list to store the stack elements

    def is_empty(self):
        # Check if the stack is empty

    def push(self, item):
        # Add an element to the top of the stack

    def pop(self):
        # Remove and return the top element from the stack if it's not empty
        # If the stack is empty, return False to indicate failure

    def peek(self):
        # Get the top element from the stack without removing it
        # Return the element if the stack is not empty, otherwise return False to indicate failure

    def size(self):
        # Return the number of elements in the stack
```
