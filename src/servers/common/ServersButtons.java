package servers.common;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServersButtons extends JButton {
    private JButton start;
    private JButton stop;
    private final JButton[] buttons;
    private JLabel status;
    private Observer observer;

    public ServersButtons() {
        start();
        stop();
        buttons = new JButton[]{start, stop};
        status = new JLabel("Server is OFF!!!");
    }

    private void start() {
        this.start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTurnOn();
            }
        });
    }

    private void setTurnOn() {
        status.setText("Server is working!!!");
        if (observer != null) {
            observer.update(true);
        }
    }


    private void stop() {
        this.stop = new JButton("Stop");
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTurnOff();
            }
        });
    }

    private void setTurnOff() {
        status.setText("Server is OFF!!!");
        if (observer != null) {
            observer.update(false);
        }
    }

    public JLabel getStatus() {
        return status;
    }

    public JButton[] buttons() {
        return buttons;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }
}
