package JDK_HW_1;

public class Main {
    public static void main(String[] args) {

        Server server = new Server();
        new Client(server);
        new Client(server);
    }
}

