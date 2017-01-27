package loggers;

import messages.IMessage;

public class ConsoleLogger implements ILogger{

    public void log(IMessage message) {
        System.out.print(message.getMessage());
    }
}
