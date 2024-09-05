package fi.shams;

public class Main {
    public static void main(String[] args) {
        APIClient apiClient = new APIClient();
        Todo todo = apiClient.fetchTodo();
        System.out.println(todo.toString());
    }
}