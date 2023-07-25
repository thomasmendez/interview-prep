class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        else:
            raise IndexError("Stack is empty")

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            raise IndexError("Stack is empty")

    def size(self):
        return len(self.items)

if __name__ == '__main__':
    # Create a new stack
    stack = Stack()
    
    # Push elements onto the stack
    stack.push(10)
    stack.push(20)
    stack.push(30)
    
    # Get the top element (peek)
    print(stack.peek())  # Output: 30
    
    # Pop an element from the stack
    print(stack.pop())  # Output: 30
    
    # Check if the stack is empty
    print(stack.is_empty())  # Output: False
    
    # Get the current size of the stack
    print(stack.size())  # Output: 2
