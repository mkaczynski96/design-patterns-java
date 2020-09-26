package structural.facade;

import structural.facade.atm.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        NewATM atm = new NewATM(bank);
        atm.withdrawMoney("882EBE4D085739FBE1C4E69EF8DBB589", 1234, 200);
    }
}
