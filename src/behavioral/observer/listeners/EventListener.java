package behavioral.observer.listeners;

public interface EventListener {
    void update(String eventType, int version);
}
