package JDK_HW_1;

public class Main {
    public static void main(String[] args) {

        int distanceBetweenWindows = 100;
        int screenWidth = 800;
        int screenHeight = 600;

        Server server = new Server();
        new Client(server);
        new Client(server);
    }
}

