package doubleroom;

import java.io.Serializable;
import singleroom.Singleroom;

public class Doubleroom extends Singleroom implements Serializable{
    String name2;
    String contact2;
    String gender2;

    public Doubleroom(String name, String contact, String gender, String name2, String contact2, String gender2) {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
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

    /**
     *
     * @return name of the second client
     */
    public String getName2(){
        return this.name2;
    }

    /**
     *
     * @return contact of the second contact
     */
    public String getContact2(){
        return this.contact2;
    }

    /**
     *
     * @return gender of the second client
     */
    public String getGender2(){
        return this.gender2;
    }

}

