package Assignment2;

public class Stack {
    LinkedList ll;

    public Stack() {
        ll = new LinkedList();
    }

    // Push an element onto the stack
    public void push(int data) {
        ll.insertAtPos(data, 1);
    }

    // Pop an element from the stack
    public int pop() {
        if (ll.head == null) {
            throw new IndexOutOfBoundsException("Pop from empty stack");
        }
        int data = ll.head.data;
        ll.deleteAtPosition(1);
        return data;
    }

    // Peek the top element of the stack
    public int peek() {
        if (ll.head == null) {
            throw new IndexOutOfBoundsException("Peek from empty stack");
        }
        return ll.head.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return ll.head == null;
    }

    // Print the stack
    public void printStack() {
        ll.printList();
    }
}

