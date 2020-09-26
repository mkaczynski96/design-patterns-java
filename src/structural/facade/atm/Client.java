package structural.facade.atm;

public class Client {
    private String clientCardHash;
    private int pin;
    private int amount;

    public Client(String clientCardHash, int pin) {
        this.clientCardHash = clientCardHash;
        this.pin = pin;
    }

    public Client(String clientCardHash, int pin, int amount) {
        this.clientCardHash = clientCardHash;
        this.pin = pin;
        this.amount = amount;
    }

    public String getClientCardHash() {
        return clientCardHash;
    }

    public void setClientCardHash(String clientCardHash) {
        this.clientCardHash = clientCardHash;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
