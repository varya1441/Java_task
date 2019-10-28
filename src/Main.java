import enities.A;
import enities.B;

public class Main {
    public static void main(String[] args) {
        new A().send("enities.A");
        new B().send("enities.B");
    }
}

