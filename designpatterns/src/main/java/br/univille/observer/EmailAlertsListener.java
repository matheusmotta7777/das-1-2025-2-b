package br.univille.observer;

// EmailAlertsListener.java
public class EmailAlertsListener implements EventListener {
    private final String email;
    private final String messageTemplate;

    public EmailAlertsListener(String email, String messageTemplate) {
        this.email = email;
        this.messageTemplate = messageTemplate;
    }

    @Override
    public void update(String filename) {
        // simulação de envio de e-mail (no site é um "system.email(...)")
        System.out.printf("[Email -> %s] %s%n", email, messageTemplate.replace("%s", filename));
    }
}
