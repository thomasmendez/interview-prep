package main

import "fmt"

type Node struct {
	data int
	next *Node
}

type LinkedList struct {
	head *Node
}

func (l *LinkedList) append(data int) {
	newNode := &Node{data: data, next: nil}

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

func (l *LinkedList) prepend(data int) {
	newNode := &Node{data: data, next: l.head}
	l.head = newNode
}

func (l *LinkedList) insertAfter(prevNode *Node, data int) {
	if prevNode == nil {
		fmt.Println("Previous node cannot be nil.")
		return
	}

	newNode := &Node{data: data, next: prevNode.next}
	prevNode.next = newNode
}

func (l *LinkedList) deleteNode(data int) {
	if l.head == nil {
		return
	}

	if l.head.data == data {
		l.head = l.head.next
		return
	}

	current := l.head
	for current.next != nil {
		if current.next.data == data {
			current.next = current.next.next
			return
		}
		current = current.next
	}
}

func (l *LinkedList) search(data int) bool {
	current := l.head
	for current != nil {
		if current.data == data {
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
			return current.data, nil
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
		fmt.Printf("%d ", current.data)
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
