package Array;

public class Todo {

    private String name;
    private Boolean completed;

    // Constructor
    public Todo(String name, Boolean completed) {
        this.name = name;
        this.completed = completed; // Fixed: added semicolon here
    }

    // Getters
    public String getName() {
        return name;
    }

    public Boolean isCompleted() {
        return completed;
    }

    // Optional: A method to display the Todo item
    public void display() {
        System.out.println("Todo: " + name + ", Completed: " + completed);
    }
}
