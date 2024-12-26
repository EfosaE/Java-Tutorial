package Array;

public class Main {
    public static void main(String[] args) {
        Todo todo1 = new Todo("todo1", false);
        Todo[] todos = { todo1 };
        todo1.display();
        System.out.println(todo1.getName());
       
    }
}
