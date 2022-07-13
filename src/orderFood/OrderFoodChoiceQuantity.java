package orderFood;

import food.Food;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static view.HotelForm.hotel_ob;

public class OrderFoodChoiceQuantity {
    private JPanel mainPanel;
    private JButton choiceButton;
    private JTextField choiceTextField;
    private static JFrame mainFrame;

    /**
     * Choosing the amount of food
     * @param roomNumber number of room
     * @param roomType type of room
     * @param typeFood type of food
     */
    OrderFoodChoiceQuantity(int roomNumber, int roomType,int typeFood){
        choiceButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int quantity = Integer.parseInt(choiceTextField.getText());
                    switch (roomType){
                        case 1 -> hotel_ob.luxury_doublerrom[roomNumber].food.add(new Food(typeFood, quantity));
                        case 2 -> hotel_ob.deluxe_doublerrom[roomNumber].food.add(new Food(typeFood, quantity));
                        case 3 -> hotel_ob.luxury_singleerrom[roomNumber].food.add(new Food(typeFood, quantity));
                        case 4 -> hotel_ob.deluxe_singleerrom[roomNumber].food.add(new Food(typeFood, quantity));
                    }
                }catch (NumberFormatException en){
                    JOptionPane.showMessageDialog(mainFrame,"Wrong input!");
                }catch (NullPointerException en){
                    JOptionPane.showMessageDialog(mainFrame,"Room not booked!");
                }
                mainFrame.setVisible(false);
            }
        });
        mainFrame = new JFrame("Order food");
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}
