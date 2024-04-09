import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FoodTest {


    /*
    Test if the input food name is the same as expected
     */
    @Test
    public void foodBerries()
    {
        assertEquals("BERRIES",String.valueOf(Food.BERRIES));
        assertNotEquals("EGGS",String.valueOf(Food.BERRIES));

    }
}
