package structural.decorator.decorators;

import structural.decorator.Notifier;

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("Sent sms: " + message);
    }
}
