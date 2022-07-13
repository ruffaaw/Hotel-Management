package book;

import holder.Holder;
import singleroom.Singleroom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static view.HotelForm.hotel_ob;

public class BookChoiceRoomSingle {
    private JPanel mainPanel;
    private JComboBox roomNumberComboBox;
    private JTextArea enterCustomerNameTextArea;
    private JTextField nameTextField;
    private JTextArea enterContactNumberTextArea;
    private JTextField contactNumberTextField;
    private JTextArea enterGenderTextArea;
    private JTextField genderTextField;
    private JButton addButton;
    private JPanel choiceRoomNumberPanel;
    private JPanel enterCustomerNamePanel;
    private JPanel enterContactNumberPanel;
    private JPanel enterGenderTextPanel;
    private JPanel addButtonPanel;
    private JTextArea outputArea;
    private static JFrame mainFrame;

    /**
     *
     * @param i type of single room
     */
    BookChoiceRoomSingle(int i){
         if(i == 3){
            String[] table = new String[hotel_ob.luxury_singleerrom.length];
            for(int j = 0; j < hotel_ob.luxury_singleerrom.length;j++){
                if(hotel_ob.luxury_singleerrom[j] == null){
                    table[j] = String.valueOf(j+31);
                }
            }
            this.roomNumberComboBox.setModel(new DefaultComboBoxModel<>(table));
        } else if(i == 4){
            String[] table = new String[hotel_ob.deluxe_singleerrom.length];
            for(int j = 0; j < hotel_ob.deluxe_singleerrom.length;j++){
                if(hotel_ob.deluxe_singleerrom[j] == null){
                    table[j] = String.valueOf(j+41);
                }
            }
            this.roomNumberComboBox.setModel(new DefaultComboBoxModel<>(table));
        }

        addButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String name, contact, gender;
                int roomNumber;
                if(i == 3)
                    roomNumber = Integer.parseInt(String.valueOf(roomNumberComboBox.getSelectedItem()))-31;
                else
                    roomNumber = Integer.parseInt(String.valueOf(roomNumberComboBox.getSelectedItem()))-41;
                name = nameTextField.getText();
                contact = contactNumberTextField.getText();
                gender = genderTextField.getText();
                CustDetails(i, roomNumber, name, contact, gender);
                mainFrame.setVisible(false);
            }
        });

         mainFrame = new JFrame("Book");
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    /**
     *
     * @param i type of single room
     * @param roomNumber number of room
     * @param name client name
     * @param contact client contact
     * @param gender client gender
     */
    public static void CustDetails(int i, int roomNumber, String name, String contact, String gender){
        switch (i){
            case 3 -> hotel_ob.luxury_singleerrom[roomNumber] = new Singleroom(name, contact, gender);
            case 4 -> hotel_ob.deluxe_singleerrom[roomNumber] = new Singleroom(name, contact, gender);
        }
    }
}

