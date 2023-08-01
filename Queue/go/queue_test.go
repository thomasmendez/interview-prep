package main

import (
	"testing"
)

func TestQueue(t *testing.T) {
	queue := NewQueue()

	// Test isEmpty() on an empty queue
	if !queue.isEmpty() {
		t.Error("Expected queue to be empty, but it's not")
	}

	// Test Enqueue and Peek
	queue.enqueue(10)
	queue.enqueue(20)
	if size := queue.size(); size != 2 {
		t.Errorf("Expected queue size to be 2, but got %d", size)
	}
	if item, err := queue.peek(); err == nil {
		if item != 10 {
			t.Errorf("Expected top item to be 10, but got %d", item)
		}
	} else {
		t.Error("Expected peek to be successful, but it failed")
	}

	// Test Dequeue
	if item, err := queue.dequeue(); err == nil {
		if item != 10 {
			t.Errorf("Expected dequeue item to be 10, but got %d", item)
		}
	} else {
		t.Error("Expected Dequeue to be successful, but it failed")
	}
	if size := queue.size(); size != 1 {
		t.Errorf("Expected queue size to be 1 after Dequeue, but got %d", size)
	}

	if item, err := queue.dequeue(); err == nil {
		if item != 20 {
			t.Errorf("Expected dequeue item to be 20, but got %d", item)
		}
	} else {
		t.Error("Expected Dequeue to be successful, but it failed")
	}

	// Test Dequeue on an empty queue
	if _, err := queue.dequeue(); err == nil {
		t.Error("Expected Dequeue to fail on an empty queue, but it succeeded")
	}

	// Test Peek on an empty queue
	if _, err := queue.peek(); err == nil {
		t.Error("Expected Peek to fail on an empty queue, but it succeeded")
	}

	queue.enqueue(1)

	// Test isEmpty() on a non-empty queue
	if queue.isEmpty() {
		t.Error("Expected queue not to be empty, but it is")
	}
}

func TestNewQueue(t *testing.T) {
	queue := NewQueue()

	if size := queue.size(); size != 0 {
		t.Errorf("Expected new queue size to be 0, but got %d", size)
	}
	if _, err := queue.peek(); err == nil {
		t.Error("Expected Peek to fail on a new queue, but it succeeded")
	}
	if _, err := queue.dequeue(); err == nil {
		t.Error("Expected Dequeue to fail on a new queue, but it succeeded")
	}
	if !queue.isEmpty() {
		t.Error("Expected new queue to be empty, but it's not")
	}
}
