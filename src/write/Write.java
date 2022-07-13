package write;

import holder.Holder;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Write implements Runnable {
    Holder hotel_ob;

    public Write(Holder hotel_ob) {
        this.hotel_ob = hotel_ob;
    }

    @Override
    public void run() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("backup");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hotel_ob);
        } catch (Exception e) {
            System.out.println("Error in writing " + e);
        }
    }
}
