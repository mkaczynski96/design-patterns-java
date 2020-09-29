package structural.decorator.decorators;

import structural.decorator.Notifier;

public class FacebookDecorator extends BaseDecorator {
    public FacebookDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendMessengerMessage(message);
    }

    private void sendMessengerMessage(String message) {
        System.out.println("Sent message by messenger: " + message);
    }
}
