package orderFood;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderFoodChoiceFood {
    private JPanel mainPanel;
    private JPanel choosingPanel;
    private JButton sandwichButton;
    private JButton pastaButton;
    private JButton noodlesButton;
    private JButton cokeButton;
    private JPanel buttonPanel;

    private static JFrame mainFrame;

    /**
     * Food selection
     * @param roomNumber number of room
     * @param roomType type of room
     */
    OrderFoodChoiceFood(int roomNumber, int roomType){
        sandwichButton.addActionListener(new ActionListener() {
            /**
             * Choosing a sandwich
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderFoodChoiceQuantity orderFoodChoiceQuantity = new OrderFoodChoiceQuantity(roomNumber,roomType,1);
                mainFrame.setVisible(false);
            }
        });
        pastaButton.addActionListener(new ActionListener() {
            /**
             * Choosing a pasta
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderFoodChoiceQuantity orderFoodChoiceQuantity = new OrderFoodChoiceQuantity(roomNumber,roomType,2);
                mainFrame.setVisible(false);
            }
        });
        noodlesButton.addActionListener(new ActionListener() {
            /**
             * Choosing the noodles
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderFoodChoiceQuantity orderFoodChoiceQuantity = new OrderFoodChoiceQuantity(roomNumber,roomType,3);
                mainFrame.setVisible(false);
            }
        });
        cokeButton.addActionListener(new ActionListener() {
            /**
             * Choosing a coke
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderFoodChoiceQuantity orderFoodChoiceQuantity = new OrderFoodChoiceQuantity(roomNumber,roomType,4);
                mainFrame.setVisible(false);
            }
        });
        mainFrame = new JFrame("Order food");
        //choosingTextArea = new JTable();
        // mForm = new RoomDetailsForm();
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
