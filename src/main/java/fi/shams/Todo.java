package fi.shams;

public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public boolean isCompleted() {
        return completed;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
