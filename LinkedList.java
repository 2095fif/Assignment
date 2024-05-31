package Assignment2;

public class LinkedList
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 2; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 2; i++) {
            if (temp.next == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        temp.next = temp.next.next;
    }

    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            throw new IllegalArgumentException("Previous node is null");
        }

        prevNode.next = prevNode.next.next;
    }

    public int searchNode(int key) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == key) {
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }
}
