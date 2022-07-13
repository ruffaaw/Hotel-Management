package book;

import doubleroom.Doubleroom;
import holder.Holder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static view.HotelForm.hotel_ob;

public class BookChoiceRoomDouble {
    private JPanel mainPanel;
    private JComboBox roomNumberComboBox;
    private JPanel choiceRoomNumberPanel;
    private JPanel dataPanel;
    private JTextField nameTextField;
    private JTextField contactNumberTextField;
    private JTextField genderTextField;
    private JTextField nameSecondTextField;
    private JTextField contactSecondNumberTextField;
    private JTextField genderSecondTextField;
    private JPanel addPanel;
    private JButton addButton;
    private JLabel choiceRoomNumberTextArea;

    /**
     *
     * @param i type of double room
     */
    BookChoiceRoomDouble(int i){

        if (i == 1){
            String[] table = new String[hotel_ob.luxury_doublerrom.length];
            for(int j = 0; j < hotel_ob.luxury_doublerrom.length;j++){
                if(hotel_ob.luxury_doublerrom[j] == null){
                    table[j] = String.valueOf(j+1);
                }
            }

            this.roomNumberComboBox.setModel(new DefaultComboBoxModel<>(table));
        } else if(i == 2) {
            String[] table = new String[hotel_ob.deluxe_doublerrom.length];
            for (int j = 0; j < hotel_ob.deluxe_doublerrom.length; j++) {
                if (hotel_ob.deluxe_doublerrom[j] == null) {
                    table[j] = String.valueOf(j + 11);
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
                String name, contact, gender, name2, contact2, gender2;
                int roomNumber;
                if(i == 1)
                    roomNumber = Integer.parseInt(String.valueOf(roomNumberComboBox.getSelectedItem()))-1;
                else
                    roomNumber = Integer.parseInt(String.valueOf(roomNumberComboBox.getSelectedItem()))-11;
                name = nameTextField.getText();
                contact = contactNumberTextField.getText();
                gender = genderTextField.getText();
                name2=nameSecondTextField.getText();
                contact2 = contactSecondNumberTextField.getText();
                gender2 = genderSecondTextField.getText();
                CustDetails(i, roomNumber, name, contact, gender, name2, contact2, gender2);
            }
        });

        JFrame mainFrame = new JFrame("Book");
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    /**
     *
     * @param i type of double room
     * @param roomNumber number of room
     * @param name client name
     * @param contact client contact
     * @param gender client gender
     * @param name2 name of the second client
     * @param contact2 contact of the second client
     * @param gender2 gender of the second client
     */
    public static void CustDetails(int i, int roomNumber, String name, String contact, String gender, String name2, String contact2, String gender2){
        switch (i){
            case 1 -> hotel_ob.luxury_doublerrom[roomNumber] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
            case 2 -> hotel_ob.deluxe_doublerrom[roomNumber] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
        }
    }
}
