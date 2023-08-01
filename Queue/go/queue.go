package main

import "fmt"

type Queue struct {
	items []int
}

func NewQueue() *Queue {
	return &Queue{items: []int{}}
}

func (q *Queue) isEmpty() bool {
	return len(q.items) == 0
}

func (q *Queue) enqueue(item int) {
	q.items = append(q.items, item)
}

func (q *Queue) dequeue() (int, error) {
	if !q.isEmpty() {
		item := q.items[0]
		q.items = q.items[1:]
		return item, nil
	}
	return 0, fmt.Errorf("Queue is empty")
}

func (q *Queue) peek() (int, error) {
	if !q.isEmpty() {
		return q.items[0], nil
	}
	return 0, fmt.Errorf("Queue is empty")
}

func (q *Queue) size() int {
	return len(q.items)
}

func main() {
	// Create a new queue
	queue := NewQueue()

	// Push elements onto the queue
	queue.enqueue(10)
	queue.enqueue(20)
	queue.enqueue(30)

	// Get the top element (peek)
	if item, err := queue.peek(); err == nil {
		fmt.Println(item) // Output: 30
	}

	// Pop an element from the queue
	if item, err := queue.dequeue(); err == nil {
		fmt.Println(item) // Output: 30
	}

	// Check if the queue is empty
	fmt.Println(queue.isEmpty()) // Output: false

	// Get the current size of the queue
	fmt.Println(queue.size()) // Output: 2
}
