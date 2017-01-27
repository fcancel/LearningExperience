package loggers;

public class LoggerBuilder {
    public enum LoggerTypes {
        CONSOLE{
            public ILogger buildYourself() {
                return new ConsoleLogger();
            }
        };

        public abstract ILogger buildYourself();
    }

    public static ILogger build(LoggerTypes loggerType) {
        return loggerType.buildYourself();
    }
}
