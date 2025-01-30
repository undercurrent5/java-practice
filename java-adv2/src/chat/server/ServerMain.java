package chat.server;

import java.io.IOException;

public class ServerMain {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        SessionManager sessionManager = new SessionManager();

//        CommandManager commandManger = new CommandMangerV1(sessionManager);
//        CommandManager commandManger = new CommandMangerV2(sessionManager);
//        CommandManager commandManger = new CommandMangerV3(sessionManager);
        CommandManager commandManger = new CommandMangerV4(sessionManager);

        Server server = new Server(PORT, commandManger, sessionManager);
        server.start();


    }
}
