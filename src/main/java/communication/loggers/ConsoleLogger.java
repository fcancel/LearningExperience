package communication.loggers;

import messages.IMessage;

public class ConsoleLogger implements ILogger {

    public final void log(final IMessage message) {
        System.out.print(message.getMessage());
    }
}
