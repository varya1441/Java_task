package connection;

public class Connection {
    static Connection connectionInstance;

    public static Connection getInstance() {
        return connectionInstance == null ? new Connection() : connectionInstance;
    }

    public void send(String message) {
        System.out.println(message);
    }
}
