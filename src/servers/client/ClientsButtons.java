package servers.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientsButtons extends JButton{
    private JButton connect;
    private JButton send;
    private JButton[] all;
    ClientsButtons(){
        all = new JButton[]{};

    }
    private void setConnect(){
        connect = new JButton("Connect");
        connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void connect(){

    }
}
