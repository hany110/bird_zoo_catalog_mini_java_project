import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the waterfowl class.
 */

public class WaterfowlTest {

  @Test
  public void testcons() {
    assertThrows(IllegalArgumentException.class, () -> {
      Shorebird b1 = new Shorebird(Bird_list.HAWKS,"Sharp eyes",false,2, "Ocean", Food.FISH);
    });
  }


}
