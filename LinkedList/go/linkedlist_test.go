package main

import (
	"fmt"
	"testing"
)

func TestLinkedList(t *testing.T) {
	ll := &LinkedList{}
	ll.append(10)
	ll.append(20)
	ll.append(30)
	ll.prepend(5)
	ll.insertAfter(ll.head.next, 15)
	ll.deleteNode(20)
	ll.display()

	// Test Append
	expectedOutput := "5 -> 10 -> 15 -> 30 -> nil"
	output := getLinkedListAsString(ll)
	if output != expectedOutput {
		t.Errorf("Append Test: Expected '%s', got '%s'", expectedOutput, output)
	}

	// Test Search
	if !ll.search(15) {
		t.Error("Search Test: Element 15 not found in the linked list")
	}
	if ll.search(20) {
		t.Error("Search Test: Element 20 found in the linked list")
	}

	// Test AccessByIndex
	value, err := ll.accessByIndex(2)
	if err != nil || value != 15 {
		t.Error("AccessByIndex Test: Failed to access element at index 2")
	}
	_, err = ll.accessByIndex(5)
	if err == nil {
		t.Error("AccessByIndex Test: Index out of range error not thrown")
	}

	// Test Size
	size := ll.size()
	if size != 4 {
		t.Errorf("Size Test: Expected size 4, got %d", size)
	}
}

// Helper function to convert the linked list to a string for easy comparison
func getLinkedListAsString(ll *LinkedList) string {
	var sb string
	current := ll.head
	for current != nil {
		sb += fmt.Sprintf("%d -> ", current.value)
		current = current.next
	}
	sb += "nil"
	return sb
}
