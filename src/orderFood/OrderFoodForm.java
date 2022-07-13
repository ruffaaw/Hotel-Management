package orderFood;

import orderFood.OrderFoodChoiceFood;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OrderFoodForm {
    private JPanel mainPanel;
    private JPanel outputPanel;
    private JPanel inputPanel;
    private JTextField inputField;
    private JButton inputbutton;
    private JLabel outputLabel;

    private static JFrame mainFrame;

    /**
     * Room number selection
     */
    public OrderFoodForm(){

        inputbutton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int roomNumber = Integer.parseInt(inputField.getText());
                    if(roomNumber > 0 && roomNumber <= 10){
                        OrderFoodChoiceFood orderFoodChoiceFood = new OrderFoodChoiceFood(roomNumber-1, 1);
                        mainFrame.setVisible(false);
                    } else if(roomNumber > 10 && roomNumber <=30){
                        OrderFoodChoiceFood orderFoodChoiceFood = new OrderFoodChoiceFood(roomNumber-11, 2);
                        mainFrame.setVisible(false);
                    }else if(roomNumber > 30 && roomNumber <=40){
                        OrderFoodChoiceFood orderFoodChoiceFood = new OrderFoodChoiceFood(roomNumber-31, 3);
                        mainFrame.setVisible(false);
                    }else if(roomNumber > 40 && roomNumber <= 60){
                        OrderFoodChoiceFood orderFoodChoiceFood = new OrderFoodChoiceFood(roomNumber-41, 4);
                        mainFrame.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(mainFrame,"Room doesn't exist!");
                    }
                }catch(NumberFormatException en){
                    JOptionPane.showMessageDialog(mainFrame,"Wrong input!");
                }
            }
        });
        mainFrame = new JFrame("Order food");
        // mForm = new RoomDetailsForm();
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}
