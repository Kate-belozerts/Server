package servers.client;

import servers.common.ServerWindow;

import javax.swing.*;
import java.awt.*;

public class ClientWindow extends JFrame {
    private static final int SIZE = 300;
    private ServerWindow serverWindow;
    private boolean state;
    private JPanel up;
    private JPanel middle;
    private JPanel down;

    public ClientWindow(ServerWindow serverWindow) {
        this.serverWindow = serverWindow;
        this.state = serverWindow.status;

        setVisible(true);
        setSize(SIZE, SIZE);
        setLocationRelativeTo(null);
        setTitle("Client Window");
        setPanelUp();

        revalidate();
        repaint();
    }

    private void setPanelUp() {
        up = new ClientPanel("");
        add(up, BorderLayout.CENTER);
    }

}
