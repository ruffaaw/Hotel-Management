package checkout;

import food.Food;

import javax.swing.*;

import static view.HotelForm.hotel_ob;

public class CheckoutDeallocateForm {

    private JTextArea checkoutTextArea;
    private JPanel mainPanel;
    private static JFrame mainFrame;

    /**
     *
     * @param roomNumber number of room
     * @param roomType type of room
     */
    CheckoutDeallocateForm(int roomNumber, int roomType){
        mainFrame = new JFrame("Checkout");
        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
        checkoutTextArea.setText(deallocate(roomNumber,roomType));
    }

    /**
     * Information about a bill
     * @param roomNumber number of room
     * @param roomType type of room
     * @return information about a bill
     */
    public static String bill(int roomNumber, int roomType) {
        double amount = 0;
        String string = "";
        String[] list = {"Sandwich", "Pasta", "Noodles", "Coke"};
        string += ("\n*******");
        string += (" Bill:-");
        string += ("*******\n");

        switch (roomType) {
            case 1 -> {
                amount += 4000;
                string +=("\nRoom Charge - " + 4000);
                string += ("\nFood Charges: ");
                string += ("\nItem\tQuantity\tPrice\n");
                string += ("-------------------------------------------------------\n");
                for (Food obb : hotel_ob.luxury_doublerrom[roomNumber].food) {
                    amount += obb.price;
                    string += list[obb.itemno - 1] + "\t"+ obb.quantity + "\t" + obb.price;
                }
            }
            case 2 -> {
                amount += 3000;
                string +=("Room Charge - " + 3000);
                string += ("\nFood Charges: ");
                string += ("\nItem\tQuantity\tPrice\n");
                string += ("-------------------------------------------------------\n");
                for (Food obb : hotel_ob.deluxe_doublerrom[roomNumber].food) {
                    amount += obb.price;
                    string += list[obb.itemno - 1] + "\t"+ obb.quantity + "\t" + obb.price;
                }
            }
            case 3 -> {
                amount += 2200;
                string += ("Room Charge - " + 2200);
                string += ("\nFood Charges: ");
                string += ("\nItem\tQuantity\tPrice\n");
                string += ("-------------------------------------------------------\n");
                for (Food obb : hotel_ob.luxury_singleerrom[roomNumber].food) {
                    amount += obb.price;
                    string += list[obb.itemno - 1] + "\t"+ obb.quantity + "\t" + obb.price;
                }
            }
            case 4 -> {
                amount += 1200;
                string += ("Room Charge - " + 1200);
                string += ("\nFood Charges: ");
                string += ("\nItem\tQuantity\tPrice\n");
                string += ("-------------------------------------------------------\n");
                for (Food obb : hotel_ob.deluxe_singleerrom[roomNumber].food) {
                    amount += obb.price;
                    string += list[obb.itemno - 1] + "\t"+ obb.quantity + "\t" + obb.price;
                }
            }
            default -> string += ("Not valid");
        }
        string += ("\nTotal Amount- " + amount);
        return string;
    }

    /**
     * Deallocate of the selected room
     * @param rn number of room
     * @param rtype type of room
     * @return information about client and confirmation of the success of the operation
     */
    public static String deallocate(int rn, int rtype) {
        char w;
        String string = "";
        switch (rtype) {
            case 1 -> {
                if (hotel_ob.luxury_doublerrom[rn] != null)
                    string += "Room used by " + hotel_ob.luxury_doublerrom[rn].name;
                else
                    return"Empty Already";

                string += bill(rn, rtype);
                hotel_ob.luxury_doublerrom[rn] = null;
                string += "\nDeallocated succesfully";
                return string;
            }
            case 2 -> {
                if (hotel_ob.deluxe_doublerrom[rn] != null)
                    string+="Room used by " + hotel_ob.deluxe_doublerrom[rn].name;
                else
                    return "Empty Already";

                string += bill(rn, rtype);
                hotel_ob.deluxe_doublerrom[rn] = null;
                string += "\n\nDeallocated succesfully";
                return string;

            }
            case 3 -> {
                if (hotel_ob.luxury_singleerrom[rn] != null)
                    string += "Room used by " + hotel_ob.luxury_singleerrom[rn].name;
                else
                    return "Empty Already";

                string += bill(rn, rtype);
                hotel_ob.luxury_singleerrom[rn] = null;
                string += "\nDeallocated succesfully";
                return string;

            }
            case 4 -> {
                if (hotel_ob.deluxe_singleerrom[rn] != null)
                    string += "Room used by " + hotel_ob.deluxe_singleerrom[rn].name;
                else
                    return "Empty Already";

                string += bill(rn, rtype);
                hotel_ob.deluxe_singleerrom[rn] = null;
                string += "\nDeallocated succesfully";

            }
        }
        return string;
    }

}
