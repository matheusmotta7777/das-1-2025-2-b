package br.univille.observer;

import java.util.*;

public class EventManager {
    private final Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... eventTypes) {
        for (String t : eventTypes) listeners.put(t, new ArrayList<>());
    }

    public void subscribe(String eventType, EventListener l) {
        listeners.get(eventType).add(l);
    }

    public void unsubscribe(String eventType, EventListener l) {
        listeners.get(eventType).remove(l);
    }

    public void notify(String eventType, String data) {
        for (EventListener l : new ArrayList<>(listeners.get(eventType))) {
            l.update(data);
        }
    }
}

