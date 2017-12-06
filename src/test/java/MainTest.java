import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private PetName mainTest = new PetName("Dominykas");

    @Test
    public void getName() throws Exception {
        assertEquals("Dominykas", mainTest.getName());
    }

    @Test
    public void testUnHappyToStart() throws Exception {
        assertFalse(mainTest.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        mainTest.playWithPeople();
        assertTrue(mainTest.isHappy());
    }
    ////
}