package holder;

import doubleroom.Doubleroom;
import singleroom.Singleroom;

import java.io.Serializable;

public class Holder implements Serializable{
    public Doubleroom[] luxury_doublerrom = new Doubleroom[10]; //Luxury
    public Doubleroom[] deluxe_doublerrom = new Doubleroom[20]; //Deluxe
    public Singleroom[] luxury_singleerrom = new Singleroom[10]; //Luxury
    public Singleroom[] deluxe_singleerrom = new Singleroom[20]; //Deluxe
}
