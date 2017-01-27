package messages;

public class MessageBuilder {

    public enum Type {
        NORMAL{
            public IMessage buildYourself(String initialMessage) {
                return new NormalMessage(initialMessage);
            }
        };

        public abstract IMessage buildYourself(String initialMessage);
    }

    public static IMessage build(Type messageType, String message) {
        return messageType.buildYourself(message);
    }

}
