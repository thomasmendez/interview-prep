package main

import "fmt"

type Stack struct {
	items []int
}

func NewStack() *Stack {
	return &Stack{items: []int{}}
}

func (s *Stack) isEmpty() bool {
	return len(s.items) == 0
}

func (s *Stack) push(item int) {
	s.items = append(s.items, item)
}

func (s *Stack) pop() (int, bool) {
	if !s.isEmpty() {
		index := len(s.items) - 1
		item := s.items[index]
		s.items = s.items[:index]
		return item, true
	}
	return 0, false
}

func (s *Stack) peek() (int, bool) {
	if !s.isEmpty() {
		index := len(s.items) - 1
		item := s.items[index]
		return item, true
	}
	return 0, false
}

func (s *Stack) size() int {
	return len(s.items)
}

func main() {
	// Create a new stack
	stack := NewStack()

	// Push elements onto the stack
	stack.push(10)
	stack.push(20)
	stack.push(30)

	// Get the top element (peek)
	if item, ok := stack.peek(); ok {
		fmt.Println(item) // Output: 30
	}

	// Pop an element from the stack
	if item, ok := stack.pop(); ok {
		fmt.Println(item) // Output: 30
	}

	// Check if the stack is empty
	fmt.Println(stack.isEmpty()) // Output: false

	// Get the current size of the stack
	fmt.Println(stack.size()) // Output: 2
}
