package ToDoList;

class Task {
    private String title;
    private String description;
    private boolean completed;
    
    // Constructs a task 
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // By default, task is not completed
    }
    // Gets the title of the task
    public String getTitle() {
        return title;
    }
    // Gets the description  of the task
    public String getDescription() {
        return description;
    }
    // Checks if the task is completed
    public boolean isCompleted() {
        return completed;
    }
    // Marks the completed task
    public void markCompleted() {
        completed = true;
    }
}


