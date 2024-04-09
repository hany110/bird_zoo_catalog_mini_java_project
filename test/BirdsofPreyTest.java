import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the birdsofprey class.
 */

public class BirdsofPreyTest {

  /*
  Method to test if the input bird is of the same type as instance type.
  If not throw error
   */
  @Test
  public void testConstructor() {
    assertThrows(IllegalArgumentException.class, () -> {
      BirdsOfPrey b1 = new BirdsOfPrey(Bird_list.OWLS,"Sharp nose",false,2,Food.OTHER_BIRDS,Food.INSECTS);
    });
  }


}
