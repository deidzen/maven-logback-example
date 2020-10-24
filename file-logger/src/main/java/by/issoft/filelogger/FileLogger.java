package by.issoft.filelogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileLogger {
    private static final Logger logger = LoggerFactory.getLogger(FileLogger.class);
    public static void main(String[] args) {
        logger.trace("Hello World!");
        logger.debug("Java is cool");
        logger.info("HEEEEEY");
        logger.warn("Some stupid message");
        logger.error("Houston, we've got some problems!!!");
    }
}
