package servers.client;

import servers.common.ServerWindow;

import javax.swing.*;

public class ClientWindow extends JFrame {
    private static final int SIZE = 300;
    private ServerWindow serverWindow;
    private JPanel up;
    private JPanel middle;
    private JPanel down;

    ClientWindow(ServerWindow serverWindow) {
        this.serverWindow = serverWindow;
        setSize(SIZE, SIZE);
        setLocationRelativeTo(null);
        setTitle("Client Window");

    }

}

