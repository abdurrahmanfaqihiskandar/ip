public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String task) {
        this.description = task;
        this.isDone = false;
    }

    public String toString() {
        return "[" + getStatusIcon() + "] "
                + this.description;
    }

    public String toStringFileFormat() {
        return "[" + getStatusIcon() + "] "
                + this.description;
    }

    public void setDone() {
        this.isDone = true;
    }

    public String getStatusIcon() {
        return (isDone ? "Done" : "Not Done");
    }
}
