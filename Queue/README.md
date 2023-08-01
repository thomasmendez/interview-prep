# Queue

Time Complexity: O(1)
Space Complexity: O(n)

| Operation     | Time Complexity | Space Complexity |
|---------------|-----------------|------------------|
| Enqueue (push)| O(1)            | O(1)             |
| Dequeue (pop) | O(1)            | O(1)             |
| Peek (front)  | O(1)            | O(1)             |
| IsEmpty       | O(1)            | O(1)             |
| Size          | O(1)            | O(1)             |

Queue Pseudo-code:

```python
Class Queue:
    def __init__(self):
    # Constructor to initialize an empty queue

    def is_empty(self):
    # Check if the queue is empty

    def enqueue(self, item):
    # Add an item to the back of the queue

    def dequeue(self):
    # Remove and return the frontmost item from the queue

    def peek(self):
    # Return the frontmost item in the queue without removing it

    def size(self):
    # Return the current size (number of elements) of the queue
```