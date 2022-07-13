package roomDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomDetailsForm {
    private JPanel mainPanel;
    private JPanel displayPanel;
    private JPanel ChoicePanel;
    private JTextArea displayArea;
    private JButton deluxeDoubleRoomButton;
    private JButton luxurySingleRoomButton;
    private JButton deluxeSingleRoomButton;
    private JButton luxuryDoubleRoomButton;

    public RoomDetailsForm() {

        luxuryDoubleRoomButton.addActionListener(new ActionListener() {
            /**
             * Information about luxury double room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
            }
        });

        deluxeDoubleRoomButton.addActionListener(new ActionListener() {
            /**
             * Information about deluxe double room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ");
            }
        });

        luxurySingleRoomButton.addActionListener(new ActionListener() {
            /**
             * Information about luxury single room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ");
            }
        });

        deluxeSingleRoomButton.addActionListener(new ActionListener() {
            /**
             * Information about deluxe single room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200");
            }
        });
        JFrame mainFrame = new JFrame("Room Details");
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}
