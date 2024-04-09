import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the pigeon class.
 */

public class PigeonTest {

  /*
  Method to test if the input bird is of the same type as instance type.
  If not throw error
   */
  @Test
  public void testConstructor() {
    assertThrows(IllegalArgumentException.class, () -> {
      Pigeon b1 = new Pigeon(Bird_list.HAWKS,"Sharp eyes",false,2, Food.INSECTS);
    });
  }


}
