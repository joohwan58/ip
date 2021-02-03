public class Todo {
    protected String name;
    protected boolean isDone;

    Todo(String name) {
        this.name = name;
        isDone = false;
    }


    public void markDone() {
        isDone = true;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2718" : " ");
    }

    public String toString() {
        return "[T][" + this.getStatusIcon() + "] " + name;
    }
}