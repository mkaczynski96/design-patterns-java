package structural.decorator.decorators;

import structural.decorator.Notifier;

public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlackMessage(message);
    }

    private void sendSlackMessage(String message) {
        System.out.println("Sent slack message: " + message);
    }
}
