package behavioral.observer.listeners;

public class IdeaListener implements EventListener {
    private int lastestJDKVersion;

    public IdeaListener(int lastestJDKVersion) {
        this.lastestJDKVersion = lastestJDKVersion;
    }

    @Override
    public void update(String eventType, int version) {
        System.out.println("Someone has performed " + eventType + " operation with update jdk to version " + version + " " +
                "in IntelliJ IDEA");
    }
}
