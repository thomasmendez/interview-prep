class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    def prepend(self, value):
        new_node = Node(value)
        new_node.next = self.head
        self.head = new_node

    def insert_after(self, prev_node, value):
        if not prev_node:
            print("Previous node is not in the list.")
            return
        new_node = Node(value)
        new_node.next = prev_node.next
        prev_node.next = new_node

    def delete_node(self, value):
        if not self.head:
            return
        
        # Special case: if the head node needs to be deleted
        if self.head.value == value:
            self.head = self.head.next
            return
        
        # Traverse the list to find the node before the one to delete
        current = self.head
        while current.next:
            if current.next.value == value:
                current.next = current.next.next
                return
            current = current.next
        
        print(f"Node with value {value} not found.")

    def search(self, value):
        current = self.head
        while current:
            if current.value == value:
                return True
            current = current.next
        return False

    def access_by_index(self, index):
        current = self.head
        count = 0
        while current:
            if count == index:
                return current.value
            count += 1
            current = current.next
        raise IndexError("Index out of range")

    def size(self):
        current = self.head
        count = 0
        while current:
            count += 1
            current = current.next
        return count

    def display(self):
        current = self.head
        while current:
            print(current.value, end=" ")
            current = current.next
        print()

if __name__ == '__main__':
    linked_list = LinkedList()
    linked_list.append(1)
    linked_list.append(2)
    linked_list.append(3)
    linked_list.prepend(0)
    linked_list.insert_after(linked_list.head.next, 1.5)
    linked_list.display()  # Output: 0 1 1.5 2 3
    linked_list.delete_node(1.5)
    linked_list.display()  # Output: 0 1 2 3
    linked_list.search(2)  # Output: True
    linked_list.search(4)  # Output: False

    linked_list.access_by_index(2)  # Output: 1.5

    linked_list.size()  # Output: 5

    linked_list.delete_node(1.5)
    linked_list.display()  # Output: 0 1 2 3