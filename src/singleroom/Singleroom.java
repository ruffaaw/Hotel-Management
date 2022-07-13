package singleroom;

import food.Food;
import java.io.Serializable;
import java.util.ArrayList;

public class Singleroom implements Serializable {
    public String name;
    protected String contact;
    protected String gender;
    public ArrayList<Food> food = new ArrayList<>();

    protected Singleroom() {
        this.name = "";
    }

    public Singleroom(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }

    /**
     *
     * @return client name
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return client contact
     */
    public String getContact(){
        return this.contact;
    }

    /**
     *
     * @return client gender
     */
    public String getGender(){
        return this.gender;
    }
}
