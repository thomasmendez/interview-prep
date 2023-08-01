package main

import (
	"testing"
)

func TestStack(t *testing.T) {
	stack := NewStack()

	// Test isEmpty() on an empty stack
	if !stack.isEmpty() {
		t.Error("Expected stack to be empty, but it's not")
	}

	// Test Push and Peek
	stack.push(10)
	stack.push(20)
	if size := stack.size(); size != 2 {
		t.Errorf("Expected stack size to be 2, but got %d", size)
	}
	if item, ok := stack.peek(); ok {
		if item != 20 {
			t.Errorf("Expected top item to be 20, but got %d", item)
		}
	} else {
		t.Error("Expected peek to be successful, but it failed")
	}

	// Test Pop
	if item, ok := stack.pop(); ok {
		if item != 20 {
			t.Errorf("Expected popped item to be 20, but got %d", item)
		}
	} else {
		t.Error("Expected Pop to be successful, but it failed")
	}
	if size := stack.size(); size != 1 {
		t.Errorf("Expected stack size to be 1 after Pop, but got %d", size)
	}

	if item, ok := stack.pop(); ok {
		if item != 10 {
			t.Errorf("Expected popped item to be 10, but got %d", item)
		}
	} else {
		t.Error("Expected Pop to be successful, but it failed")
	}

	// Test Pop on an empty stack
	if _, ok := stack.pop(); ok {
		t.Error("Expected Pop to fail on an empty stack, but it succeeded")
	}

	// Test Peek on an empty stack
	if _, ok := stack.peek(); ok {
		t.Error("Expected Peek to fail on an empty stack, but it succeeded")
	}

	stack.push(1)

	// Test isEmpty() on a non-empty stack
	if stack.isEmpty() {
		t.Error("Expected stack not to be empty, but it is")
	}
}

func TestNewStack(t *testing.T) {
	stack := NewStack()

	if size := stack.size(); size != 0 {
		t.Errorf("Expected new stack size to be 0, but got %d", size)
	}
	if _, ok := stack.peek(); ok {
		t.Error("Expected Peek to fail on a new stack, but it succeeded")
	}
	if _, ok := stack.pop(); ok {
		t.Error("Expected Pop to fail on a new stack, but it succeeded")
	}
	if !stack.isEmpty() {
		t.Error("Expected new stack to be empty, but it's not")
	}
}
