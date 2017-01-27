import loggers.ILogger;
import messages.IMessage;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCommunication {

    //TODO think about how to implement the communication

    @Test
    public void GameCommunication_AtCreation_LogsMessage() {
        ILogger mockLogger = mock(ILogger.class);

        //GameCommunication gameCommunication = new GameCommunication(IReader input, ILogger output);

        verify(mockLogger).log(any(IMessage.class));
    }
}
