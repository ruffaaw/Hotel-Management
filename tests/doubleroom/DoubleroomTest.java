package doubleroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleroomTest {

    @Test
    public void testStructureDoubleroom(){
        Doubleroom doubleroom = new Doubleroom(
                "Rafael",
                "123456789",
                "male",
                "Angelika",
                "987654321",
                "female"
        );

        assertEquals("Rafael",doubleroom.getName());
        assertEquals("123456789", doubleroom.getContact());
        assertEquals("male", doubleroom.getGender());
        assertEquals("Angelika", doubleroom.getName2());
        assertEquals("987654321", doubleroom.getContact2());
        assertEquals("female", doubleroom.getGender2());
    }

}