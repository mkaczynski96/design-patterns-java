package structural.facade;

import structural.facade.atm.*;

public class NewATM {
    private boolean connectionWithBank;
    private final ClientValidator clientValidator;
    private final Operations operations;
    private final Bank bank;

    public NewATM(Bank bank) {
        this.bank = bank;
        this.connectionWithBank = bank.isConnected();
        clientValidator = new ClientValidator(bank);
        operations = new OperationsImpl(bank);
    }

    public void withdrawMoney(String hash, int pin, int amountToWithdraw){
        System.out.println("Withdrawing money started...");
        if (connectionWithBank){
            Client client = new Client(hash, pin);
            if (clientValidator.areClientCredentialsValidate(client)){
                if(clientValidator.isRequestedAmountAbleToWithdraw(client, amountToWithdraw)) {
                    // With full of awareness, rollback is omitted
                    operations.showAmount(client);
                    operations.withdraw(client, amountToWithdraw);
                    operations.showAmount(client);
                }
            }
        }
    }
}
