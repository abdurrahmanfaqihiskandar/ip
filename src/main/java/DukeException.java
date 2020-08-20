public class DukeException {
    protected final String MESSAGE_ALL_TASKS_EMPTY_INPUT = "    I am sorry my Lord. "
            + "You have to give a command.\n";
    protected final String MESSAGE_ALL_TASKS_INVALID_COMMAND = "    I am sorry my Lord. "
            + "I do not recognise that command.\n";
    protected final String MESSAGE_ALL_TASKS_EMPTY_DESCRIPTION = "    I am sorry my Lord. "
            + "Your description cannot be empty.\n";
    protected final String MESSAGE_DEADLINE_NO_BY = "    I am sorry my Lord. "
            + "A deadline must have a specific date/time.\n";
    protected final String MESSAGE_EVENT_NO_START_END = "    I am sorry my Lord. "
            + "An event must have a start and end time.\n";

    public String emptyInputMessage() {
        return MESSAGE_ALL_TASKS_EMPTY_INPUT;
    }

    public String invalidCommandMessage() {
        return MESSAGE_ALL_TASKS_INVALID_COMMAND;
    }

    public String emptyDescriptionMessage() {
        return MESSAGE_ALL_TASKS_EMPTY_DESCRIPTION;
    }

    public String deadlineNoByMessage() {
        return MESSAGE_DEADLINE_NO_BY;
    }

    public String eventNoStartEndMessage() {
        return MESSAGE_EVENT_NO_START_END;
    }
}
