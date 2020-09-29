package behavioral.observer;

import behavioral.observer.listeners.EclipseListener;
import behavioral.observer.listeners.IdeaListener;

public class Main {
    public static void main(String[] args) {
        JDK jdk = new JDK();
        jdk.eventManager.subscribe("release", new IdeaListener(14));
        jdk.eventManager.subscribe("release", new EclipseListener(14));

        jdk.addVersionOfRelease();
    }
}
