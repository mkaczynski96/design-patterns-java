package structural.decorator;

import structural.decorator.decorators.FacebookDecorator;
import structural.decorator.decorators.SMSDecorator;
import structural.decorator.decorators.SlackDecorator;

public class App {
    private Notifier stack;

    public App() {
        this.stack = new Notifier();
        stack = new FacebookDecorator(stack);
        stack = new SlackDecorator(stack);
        stack = new SMSDecorator(stack);
        setNotifier(stack);
        send();
    }

    private void setNotifier(Notifier notifier) {
        this.stack = notifier;
    }

    private void send() {
        stack.send("Have you ever heard The Lawyer - I wanna MMM?");
    }
}
