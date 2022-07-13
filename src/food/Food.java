package food;

import java.io.Serializable;

public class Food implements Serializable {
    public int itemno;
    public int quantity;
    public float price;

    /**
     *
     * @param itemno type of food
     * @param quantity quantity of food
     */
    public Food(int itemno, int quantity) {
        this.itemno = itemno;
        this.quantity = quantity;
        switch (itemno) {
            case 1 -> price = quantity * 50;
            case 2 -> price = quantity * 60;
            case 3 -> price = quantity * 70;
            case 4 -> price = quantity * 30;
        }
    }
}
