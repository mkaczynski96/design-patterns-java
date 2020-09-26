package structural.facade.atm;

import java.util.Optional;

public class OperationsImpl implements Operations {
    private final Bank bank;

    public OperationsImpl(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void deposit(Client client, int amount) {
        Optional<Client> c = Optional.ofNullable(bank.getClient(client));
        if (c.isPresent()) {
            int clientAmount = c.get().getAmount() + amount;
            c.get().setAmount(clientAmount);
        }
    }

    public void withdraw(Client client, int amount) {
        Optional<Client> c = Optional.ofNullable(bank.getClient(client));
        if (c.isPresent()) {
            int clientAmount = c.get().getAmount() - amount;
            c.get().setAmount(clientAmount);
        }
    }

    @Override
    public void showAmount(Client client) {
        Optional<Client> c = Optional.ofNullable(bank.getClient(client));
        if (c.isPresent()) {
            System.out.println("Client cash: " + c.get().getAmount());
        }
    }
}
