package communication;

import communication.loggers.ILogger;
import messages.IMessage;
import messages.NormalMessage;

public class GameCommunication {

    private static final String WELCOME_MESSAGE = "Stub message, please change";
    private static final IMessage MESSAGE_CLASS = new NormalMessage(WELCOME_MESSAGE);

    public GameCommunication(final ILogger logger) {
        logger.log(MESSAGE_CLASS);
    }
}
