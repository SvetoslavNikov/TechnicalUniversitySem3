package javaSU.su4OOP;

import jdk.dynalink.StandardOperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.*;

public class DependencyInjection {
    public static void main(String[] args) {

        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Application app = new Application(consoleLogger);
        Application app2 = new Application(fileLogger);
        app.getLogger().log("RABOTIM LI?????");
        app2.getLogger().log("May rabotim");
    }
}

interface Logger {
    void log(String message);

}

class Application {
    private Logger logger;

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Application(Logger logger) {
        this.logger = logger;
    }
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        Path path = Path.of("C:\\Users\\Lenovo\\IdeaProjects\\TechnicalUniversitySem3\\src\\javaSU\\su4OOP\\message.txt");

        try {
            Files.write(path, (message).getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

