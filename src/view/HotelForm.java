package view;

import book.BookChoiceRoomTypeForm;
import checkout.CheckoutForm;
import holder.Holder;
import orderFood.OrderFoodForm;
import roomAvailability.RoomAvailabilityForm;
import roomDetails.RoomDetailsForm;
import write.Write;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class HotelForm {
    private static HotelForm mForm;
    private RoomDetailsForm mOptionForm;
    private JPanel mainPanel;
    private JButton exitButton;
    private JPanel optionsPanel;
    private JButton displayRoomDetailsButton;
    private JButton displayRoomAvailabilityButton;
    private JButton bookButton;
    private JButton orderFoodButton;
    private JButton checkoutButton;
    private JPanel exitPanel;
    private JPanel textPanel;

    public static Holder hotel_ob = new Holder();

    public HotelForm(){

        displayRoomDetailsButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                RoomDetailsForm roomDetailsForm = new RoomDetailsForm();
            }
        });

        displayRoomAvailabilityButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                RoomAvailabilityForm availabilityForm = new RoomAvailabilityForm();

            }
        });

        bookButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                BookChoiceRoomTypeForm bookForm = new BookChoiceRoomTypeForm();
            }
        });

        orderFoodButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderFoodForm orderFoodForm = new OrderFoodForm();

            }
        });

        checkoutButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckoutForm checkoutForm = new CheckoutForm();

            }
        });

        exitButton.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread thread = new Thread(new Write(hotel_ob));
                thread.start();
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        try {
            File f = new File("backup");
            if(f.exists()) {
                FileInputStream fileInputStream = new FileInputStream(f);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                hotel_ob = (Holder) objectInputStream.readObject();
            }
            JFrame mainFrame = new JFrame("Hotel management");
            mForm = new HotelForm();
            mainFrame.setContentPane(mForm.mainPanel);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.pack();
            mainFrame.setVisible(true);

        }catch(Exception e){
            System.out.println("Not a valid input");
        }
    }
}
