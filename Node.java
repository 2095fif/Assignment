package ToDoList;

class Node {
    private Task task;
    private Node next;

    // constructs  the node
    public Node(Task task) {
        this.task = task;
        this.next = null; //  next is null
    }
    // Gets the task associated with node 
    public Task getTask() {
        return task;
    }
    // Gets the next node 
    public Node getNext() {
        return next;
    }
    // Sets the next node 
    public void setNext(Node next) {
        this.next = next;
    }
}
