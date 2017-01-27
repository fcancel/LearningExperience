package messages;

public class NormalMessage implements IMessage {
    private String message;

    public NormalMessage(String initialMessage) {
        this.message = initialMessage;
    }

    public String getMessage() {
        return message;
    }
}
