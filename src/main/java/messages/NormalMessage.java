package messages;

public class NormalMessage implements IMessage {
    private String message;

    public NormalMessage(final String initialMessage) {
        this.message = initialMessage;
    }

    public final String getMessage() {
        return message;
    }
}
