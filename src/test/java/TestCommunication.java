import communication.GameCommunication;
import communication.loggers.ILogger;
import communication.readers.IReader;
import messages.IMessage;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCommunication {

    //TODO think about how to implement the communication

    @Test
    public void GameCommunication_AtCreation_LogsMessage() {
        ILogger mockLogger = mock(ILogger.class);

        new GameCommunication(mockLogger);

        verify(mockLogger).log(any(IMessage.class));
    }
}
