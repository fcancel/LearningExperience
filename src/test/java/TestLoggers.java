import loggers.ConsoleLogger;
import loggers.ILogger;
import loggers.LoggerBuilder;
import messages.IMessage;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLoggers {
    private final static String TEST_STRING = "test";

    private class stubMessage implements IMessage {


        public String getMessage() {
            return TEST_STRING;
        }
    }

    @Test
    public void ConsoleLogger_Logs_MessageToConsole(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ILogger loggerToTest = new ConsoleLogger();

        loggerToTest.log(new stubMessage());

        assertEquals(TEST_STRING, outContent.toString());
    }

    @Test
    public void LoggerBuilder_builds_ConsoleLogger(){
        ILogger loggerToTest = LoggerBuilder.build(LoggerBuilder.LoggerTypes.CONSOLE);

        assertTrue(ConsoleLogger.class.equals(loggerToTest.getClass()));
    }
}
