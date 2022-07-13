package roomAvailability;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static view.HotelForm.hotel_ob;

public class RoomAvailabilityForm {
    private JPanel mainPanel;
    private JPanel displayPanel;
    private JPanel choicePanel;
    private JButton luxuryDoubleRoomButton;
    private JButton deluxeDoubleRoomButton;
    private JButton luxurySingleRoomButton;
    private JButton deluxeSingleRoomButton;
    private JLabel displayLabel;

    String string = "";

    public RoomAvailabilityForm(){

        luxuryDoubleRoomButton.addActionListener(new ActionListener() {
            /**
             * Information about the availability of a luxury double room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                string = availability(1);
                displayLabel.setText(string);
            }
        });

        deluxeDoubleRoomButton.addActionListener(new ActionListener() {
            /**
             * Information about the availability of a deluxe double room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                string = availability(2);
                displayLabel.setText(string);
            }
        });

        luxurySingleRoomButton.addActionListener(new ActionListener() {
            /**
             * Information about the availability of a luxury single room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                string = availability(3);
                displayLabel.setText(string);
            }
        });

        deluxeSingleRoomButton.addActionListener(new ActionListener() {
            /**
             * Information about the availability of a deluxe single room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                string = availability(4);
                displayLabel.setText(string);
            }
        });
        JFrame mainFrame = new JFrame("Room Availablility");
        // mForm = new RoomDetailsForm();
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    /**
     * Checks the availability of the selected room
     * @param i the number of selected room
     * @return information about availability of selected room
     */
    public static String availability(int i) {
        int j, count = 0;
        switch (i) {
            case 1:
                for (j = 0; j < 10; j++) {
                    if (hotel_ob.luxury_doublerrom[j] == null)
                        count++;
                }
                break;
            case 2:
                for (j = 0; j < hotel_ob.deluxe_doublerrom.length; j++) {
                    if (hotel_ob.deluxe_doublerrom[j] == null)
                        count++;
                }
                break;
            case 3:
                for (j = 0; j < hotel_ob.luxury_singleerrom.length; j++) {
                    if (hotel_ob.luxury_singleerrom[j] == null)
                        count++;
                }
                break;
            case 4:
                for (j = 0; j < hotel_ob.deluxe_singleerrom.length; j++) {
                    if (hotel_ob.deluxe_singleerrom[j] == null)
                        count++;
                }
                break;
            default:
                return "Enter valid option";
            //break;
        }
        return "Number of rooms available : " + count;
    }
}
