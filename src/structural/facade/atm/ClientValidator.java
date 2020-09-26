package structural.facade.atm;

import java.util.Optional;

public class ClientValidator {
    private final Bank bank;

    public ClientValidator(Bank bank) {
        this.bank = bank;
    }

    public boolean areClientCredentialsValidate(Client client) {
        Optional<Client> c = Optional.ofNullable(bank.getClient(client));
        return c.isPresent() && client.getClientCardHash().equals(c.get().getClientCardHash()) && client.getPin() == c.get().getPin();
    }

    public boolean isRequestedAmountAbleToWithdraw(Client client, int amountToWithdraw) {
        Optional<Client> c = Optional.ofNullable(bank.getClient(client));
        return c.isPresent() && c.get().getAmount() >= amountToWithdraw;
    }
}
