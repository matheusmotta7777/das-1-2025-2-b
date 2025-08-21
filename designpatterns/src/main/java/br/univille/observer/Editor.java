package br.univille.observer;

// Editor.java
public class Editor {
    public final EventManager events;
    private String file;

    public Editor() {
        // exatamente como no exemplo: eventos "open" e "save"
        this.events = new EventManager("open", "save");
    }

    public void openFile(String path) {
        this.file = path;
        System.out.println("Opening: " + path);
        events.notify("open", file);
    }

    public void saveFile() {
        if (file == null) {
            System.out.println("Nothing to save: no file opened.");
            return;
        }
        System.out.println("Saving: " + file);
        // aqui seria onde você escreveria no disco
        events.notify("save", file);
    }
}
