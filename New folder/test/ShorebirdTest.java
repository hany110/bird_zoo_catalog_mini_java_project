import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the pigeon class.
 */

public class ShorebirdTest {

  Shorebird b1 = new Shorebird(Bird_list.GREAT_AUK,"Sharp eyes",false,2, "Ocean", Food.INSECTS);

  @Test
  public void testcons1() {
    assertThrows(IllegalArgumentException.class, () -> {
      Shorebird b1 = new Shorebird(Bird_list.HAWKS,"Sharp eyes",false,2, "Ocean", Food.INSECTS);
    });
  }


}
