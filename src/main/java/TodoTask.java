/**
 * Represents a todo task in the Dul application.
 */
public class TodoTask extends Task {

    public TodoTask(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}

