package br.univille.observer;

// Application.java
public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener(
                "app.log",
                "Someone has opened/changed the file: %s"
        );
        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s"
        );

        // registro conforme o exemplo do Guru
        editor.events.subscribe("open", logger);
        editor.events.subscribe("save", emailAlerts);

        editor.openFile("contract.pdf");
        editor.saveFile();

        // demonstrando unsubscribe
        editor.events.unsubscribe("save", emailAlerts);
        editor.saveFile();
    }
}
