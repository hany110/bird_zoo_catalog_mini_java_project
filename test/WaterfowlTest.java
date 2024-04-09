import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * A JUnit test class for the waterfowl class.
 */

public class WaterfowlTest {

  /*
  Method to test if the input bird is of the same type as instance type.
  If not throw error
   */
  @Test
  public void testConstructor() {
    assertThrows(IllegalArgumentException.class, () -> {
      Shorebird b1 = new Shorebird(Bird_list.HAWKS,"Sharp eyes",false,2, "Ocean", Food.FISH);
    });
  }



}
