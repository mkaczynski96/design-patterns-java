package structural.facade.atm;

public interface Operations {
    void deposit(Client client, int amount);
    void withdraw(Client client, int amount);
    void showAmount(Client client);
}
