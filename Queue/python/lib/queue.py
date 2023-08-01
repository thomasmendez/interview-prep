class Queue:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def enqueue(self, item):
        self.items.append(item)

    def dequeue(self):
        if not self.is_empty():
            return self.items.pop(0)
        else:
            raise IndexError("Queue is empty")

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            raise IndexError("Queue is empty")

    def size(self):
        return len(self.items)

if __name__ == '__main__':
    # Create a new queue
    queue = Queue()

    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)
    
    # Checking the size of the queue
    print(queue.size())  # Output: 3

    # Removing the frontmost item from the queue
    print(queue.dequeue())  # Output: 10

    # Checking the frontmost item in the queue
    print(queue.peek())  # Output: 20

    # Checking if the queue is empty
    print(queue.is_empty())  # Output: False

    # Removing all remaining elements from the queue
    while not queue.is_empty():
        print(queue.dequeue())

    # Checking if the queue is empty again
    print(queue.is_empty())  # Output: True
