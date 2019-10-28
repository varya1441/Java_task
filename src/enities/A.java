package enities;

import connection.Connection;

public class A {
    public void send(String message) {
        Connection.getInstance().send(message);
    }
}
