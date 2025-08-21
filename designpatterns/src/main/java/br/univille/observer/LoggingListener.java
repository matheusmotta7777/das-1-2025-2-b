package br.univille.observer;

// LoggingListener.java
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggingListener implements EventListener {
    private final String logFile;
    private final String messageTemplate;

    public LoggingListener(String logFile, String messageTemplate) {
        this.logFile = logFile;
        this.messageTemplate = messageTemplate;
    }

    @Override
    public void update(String filename) {
        try (PrintWriter out = new PrintWriter(new FileWriter(logFile, true))) {
            out.println(messageTemplate.replace("%s", filename));
        } catch (IOException e) {
            System.err.println("Failed to write log: " + e.getMessage());
        }
    }
}

