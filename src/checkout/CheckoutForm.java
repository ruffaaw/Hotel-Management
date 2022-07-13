package checkout;

import checkout.CheckoutDeallocateForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckoutForm {
    private JPanel mainPanel;
    private JLabel outputArea;
    private JTextField inputField;
    private JButton inputButton;
    private JPanel outputPanel;
    private JPanel inputPanel;
    private static JFrame mainFrame;

    /**
     * Room number selection to check out
     */
    public CheckoutForm(){
        inputButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int roomNumber = Integer.parseInt(inputField.getText());
                    if(roomNumber > 0 && roomNumber <= 10){
                        CheckoutDeallocateForm checkoutDeallocateForm = new CheckoutDeallocateForm(roomNumber-1, 1);
                        mainFrame.setVisible(false);
                    } else if(roomNumber > 10 && roomNumber <=30){
                        CheckoutDeallocateForm checkoutDeallocateForm = new CheckoutDeallocateForm(roomNumber-11, 2);
                        mainFrame.setVisible(false);
                    }else if(roomNumber > 30 && roomNumber <=40){
                        CheckoutDeallocateForm checkoutDeallocateForm = new CheckoutDeallocateForm(roomNumber-31, 3);
                        mainFrame.setVisible(false);
                    }else if(roomNumber > 40 && roomNumber <= 60){
                        CheckoutDeallocateForm checkoutDeallocateForm = new CheckoutDeallocateForm(roomNumber-41, 4);
                        mainFrame.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(mainFrame,"Room doesn't exist!");
                    }
                }catch(NumberFormatException en){
                    JOptionPane.showMessageDialog(mainFrame,"Wrong input!");
                }
            }
        });

        mainFrame = new JFrame("Checkout");
        // mForm = new RoomDetailsForm();
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
