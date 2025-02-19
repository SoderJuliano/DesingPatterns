package org.example.util;

import java.util.logging.*;

public class GlobalLogger {
    private static final Logger logger = Logger.getLogger(GlobalLogger.class.getName());

    static {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new CustomFormatter());
        handler.setLevel(Level.INFO);
        logger.addHandler(handler);
        logger.setLevel(Level.INFO);
        logger.setUseParentHandlers(false);
    }

    public static void log(Level level, String message) {
        logger.log(level, message);
    }

    private static class CustomFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getMessage() + System.lineSeparator();
        }
    }
}