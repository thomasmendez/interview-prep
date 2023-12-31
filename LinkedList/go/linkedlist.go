package main

import "fmt"

type Node struct {
	value int
	next  *Node
}

type LinkedList struct {
	head *Node
}

func (l *LinkedList) append(value int) {
	newNode := &Node{value: value, next: nil}

	if l.head == nil {
		l.head = newNode
	} else {
		current := l.head
		for current.next != nil {
			current = current.next
		}
		current.next = newNode
	}
}

func (l *LinkedList) prepend(value int) {
	newNode := &Node{value: value, next: l.head}
	l.head = newNode
}

func (l *LinkedList) insertAfter(prevNode *Node, value int) {
	if prevNode == nil {
		fmt.Println("Previous node cannot be nil.")
		return
	}

	newNode := &Node{value: value, next: prevNode.next}
	prevNode.next = newNode
}

func (l *LinkedList) deleteNode(value int) {
	if l.head == nil {
		return
	}

	if l.head.value == value {
		l.head = l.head.next
		return
	}

	current := l.head
	for current.next != nil {
		if current.next.value == value {
			current.next = current.next.next
			return
		}
		current = current.next
	}
}

func (l *LinkedList) search(value int) bool {
	current := l.head
	for current != nil {
		if current.value == value {
			return true
		}
		current = current.next
	}
	return false
}

func (l *LinkedList) accessByIndex(index int) (int, error) {
	current := l.head
	count := 0
	for current != nil {
		if count == index {
			return current.value, nil
		}
		count++
		current = current.next
	}
	return 0, fmt.Errorf("Index out of range")
}

func (l *LinkedList) size() int {
	current := l.head
	count := 0
	for current != nil {
		count++
		current = current.next
	}
	return count
}

func (l *LinkedList) display() {
	current := l.head
	for current != nil {
		fmt.Printf("%d ", current.value)
		current = current.next
	}
	fmt.Println()
}

func main() {
	linkedList := LinkedList{}
	linkedList.append(1)
	linkedList.append(2)
	linkedList.append(3)
	linkedList.prepend(0)
	linkedList.insertAfter(linkedList.head.next, 1)
	linkedList.display() // Output: 0 1 1 2 3

	linkedList.deleteNode(1)
	linkedList.display() // Output: 0 1 2 3
}
