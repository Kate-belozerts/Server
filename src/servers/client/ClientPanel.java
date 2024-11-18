package servers.client;

import javax.swing.*;
import java.awt.*;

public class ClientPanel extends JPanel {
    private JPanel panelUp;
    private JPanel panelMid;
    private JPanel panelDown;
    private JButton connect;
    private JButton send;

    ClientPanel(String text) {
        setLayout(new BorderLayout());
        JTextArea textArea;
        panelMid = new JPanel();

        if (text.length() > 0) {
            textArea = new JTextArea(text);
            panelMid.add(textArea);
        } else {
            textArea = new JTextArea("History is empty yet");
            panelMid.add(textArea);
        }
        add(panelMid, BorderLayout.CENTER);
    }
    ClientPanel(JButton button) {

    }
}
