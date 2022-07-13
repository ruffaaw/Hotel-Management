package singleroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleroomTest {

    @Test
    public void testStructureSingleroom(){
        try{
            Singleroom singleroom = new Singleroom(
                    "Rafal",
                    "123456789",
                    "male"
            );

            assertEquals("Rafal",singleroom.getName());
            assertEquals("123456789",singleroom.getContact());
            assertEquals("male", singleroom.getGender());
        }catch(Exception e){
            System.out.println("Invalid details!");
        }
    }

}