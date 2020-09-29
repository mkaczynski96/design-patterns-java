package structural.decorator.decorators;

import structural.decorator.Notifier;

public class BaseDecorator extends Notifier {
    private Notifier wrappee;

    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
