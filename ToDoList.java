package ToDoList;

class ToDoList {
    private Node head;
    
    // Constructs an empty to-do list
    public ToDoList() {
        this.head = null; // the list is empty
    }
    // Adds a new task to the to-do list 
    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
// Marks a completed task based on its title 
public void markToDoAsCompleted(String title) {
    Node current = head;
    while (current != null) {
        Task task = current.getTask();
        if (task.getTitle().equals(title)) {
            task.markCompleted();
            return; // Exit once found and marked as completed
        }
        current = current.getNext();
    }
}
//Displays the list of tasks 
public void viewToDoList() {
    Node current = head;
    if (current == null) {
        System.out.println("To-Do List is empty.");
        return;
    }
    System.out.println("To-Do List:");
    while (current != null) {
        Task task = current.getTask();
        System.out.println("Title: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Completed: " + (task.isCompleted() ? "Yes" : "No"));
        System.out.println("-----------------------");
        current = current.getNext();
    }
}
}