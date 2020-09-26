package structural.facade.atm;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Client> clientDatabase = new ArrayList<>();
    boolean connection;

    public Bank() {
        Client client1 = new Client("882EBE4D085739FBE1C4E69EF8DBB589", 1234, 5000);
        clientDatabase.add(client1);
        connection = true;
    }

    public boolean isConnected() {
        return connection;
    }

    public void setConnection(boolean connection) {
        this.connection = connection;
    }

    Client getClient(Client client) {
        for (Client c : clientDatabase) {
            if (c.getClientCardHash().equals(client.getClientCardHash()) && c.getPin() == client.getPin()) {
                return c;
            }
        }
        return null;
    }
}
