package servers.common;

import javax.swing.*;
import java.awt.*;

public class ServerWindow extends JFrame {
    private static final int SIZE = 300;
    private final int LOCATION_X = 300;
    private final int LOCATION_Y = 500;
    private JPanel panel;
    public boolean status;

    public ServerWindow() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(SIZE, SIZE);
        setLocation(LOCATION_Y, LOCATION_X);
        setTitle("Server");
        createPanel();

        setStatus();
        revalidate(); // расположить код согласно новым изменениям(?)
        repaint();
    }

    void createPanel() {
        this.panel = new ServerPanel();
        add(panel, BorderLayout.CENTER);

    }

    void setStatus() {
        Observer observer = new Observer() {
            @Override
            public void update(boolean serverStatus) {
                status = serverStatus;
                System.out.println(status);
            }
        };
        ((ServerPanel) panel).addObserver(observer);
    }

}
