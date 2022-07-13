package book;

import book.BookChoiceRoomDouble;
import book.BookChoiceRoomSingle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BookChoiceRoomTypeForm {
    private JPanel mainPanel;
    private JTextField inputField;
    private JButton inputButton;
    private JPanel displayPanel;
    private JPanel choicePanel;
    private JButton luxuryDoubleRoomButton;
    private JButton deluxeDoubleRoomButton;
    private JButton luxurySingleRoomButton;
    private JButton deluxeSingleRoomButton;

    String string = "";

    int choice;
    public BookChoiceRoomTypeForm(){

        JFrame mainFrame = new JFrame("Book");
        // mForm = new RoomDetailsForm();
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

        luxuryDoubleRoomButton.addActionListener(new ActionListener() {
            /**
             * Choosing a luxury double room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                choice = 1;
                BookChoiceRoomDouble bookChoiceRoomDouble = new BookChoiceRoomDouble(choice);
                mainFrame.setVisible(false);
            }
        });

        deluxeDoubleRoomButton.addActionListener(new ActionListener() {
            /**
             * Choosing a deluxe double room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                choice = 2;
                BookChoiceRoomDouble bookChoiceRoomDouble = new BookChoiceRoomDouble(choice);
                mainFrame.setVisible(false);
            }
        });

        luxurySingleRoomButton.addActionListener(new ActionListener() {
            /**
             * Choosing a luxury single room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                choice = 3;
                BookChoiceRoomSingle bookChoiceRoomNumber = new BookChoiceRoomSingle(choice);
                mainFrame.setVisible(false);
            }
        });

        deluxeSingleRoomButton.addActionListener(new ActionListener() {
            /**
             * Choosing a deluxe single room
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                choice = 4;
                BookChoiceRoomSingle bookChoiceRoomNumber = new BookChoiceRoomSingle(choice);
                mainFrame.setVisible(false);
            }
        });
    }
}
