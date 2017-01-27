package messages;

public final class MessageBuilder {

    private MessageBuilder() {

    }

    public enum Type {
        NORMAL {
            public IMessage buildYourself(final String initialMessage) {
                return new NormalMessage(initialMessage);
            }
        };

        public abstract IMessage buildYourself(String initialMessage);
    }

    public static IMessage build(final Type messageType, final String message) {
        return messageType.buildYourself(message);
    }

}
