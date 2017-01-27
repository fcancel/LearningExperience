import messages.IMessage;
import messages.MessageBuilder;
import messages.NormalMessage;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestMessages {
    private static final String STRING_TO_TEST = "test";

    @Test
    public void normalMessage_GivesCreatedValue_AtCreation(){
        IMessage messageToBeTested = new NormalMessage(STRING_TO_TEST);

        assert(STRING_TO_TEST.equals(messageToBeTested.getMessage()));
    }

    @Test
    public void MessageBuilder_builds_NormalMessage(){
        IMessage messageClassToTest = MessageBuilder.build(MessageBuilder.Type.NORMAL, STRING_TO_TEST);

        assertTrue(NormalMessage.class.equals(messageClassToTest.getClass()));
    }
}
