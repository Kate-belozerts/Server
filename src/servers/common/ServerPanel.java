package servers.common;

import javax.swing.*;
import java.awt.*;

public class ServerPanel extends JPanel {
    private ServersButtons serversButtons;
    private JLabel status;

    public ServerPanel() {
        setLayout(new BorderLayout());

        JPanel serverPanel = new JPanel(new GridLayout(1, 2));
        serversButtons = new ServersButtons();
        serverPanel.add(serversButtons.buttons()[0]);
        serverPanel.add(serversButtons.buttons()[1]);

        add(serverPanel, BorderLayout.CENTER);
        status();
    }

    private void status() {
        JPanel showStatus = new JPanel();
        status = serversButtons.getStatus();
        showStatus.add(status);
        add(showStatus, BorderLayout.SOUTH);
    }

    public void addObserver(Observer observer) {
        serversButtons.setObserver(observer);
    }
}
