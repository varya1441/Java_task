package enities;

import connection.Connection;

public class B {
    public void send(String message) {
        Connection.getInstance().send(message);
    }
}
