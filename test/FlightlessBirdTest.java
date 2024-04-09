import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the flightlessbird class.
 */

public class FlightlessBirdTest {

  /*
  Method to test if the input bird is of the same type as instance type.
  If not throw error
   */
  @Test
  public void testConstructor() {
    assertThrows(IllegalArgumentException.class, () -> {
      FlightlessBird fb = new FlightlessBird(Bird_list.OWLS,"cannot fly",false, 0, Food.BERRIES);
    });
  }


}
