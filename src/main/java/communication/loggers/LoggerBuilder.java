package communication.loggers;

public final class LoggerBuilder {

    private LoggerBuilder() {

    }

    public enum LoggerTypes {
        CONSOLE {
            public ILogger buildYourself() {
                return new ConsoleLogger();
            }
        };

        public abstract ILogger buildYourself();
    }

    public static ILogger build(final LoggerTypes loggerType) {
        return loggerType.buildYourself();
    }
}
