package behavioral.observer;

import behavioral.observer.publisher.EventManager;

public class JDK {
    private int versionOfRelease;

    public EventManager eventManager;

    public JDK() {
        this.eventManager = new EventManager("release");
    }

    public void addVersionOfRelease() {
        this.versionOfRelease = 14;
        eventManager.notify("release", versionOfRelease);
    }
}
