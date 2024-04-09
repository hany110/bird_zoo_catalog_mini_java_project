import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the owl class.
 */

public class OwlTest {

  @Test
  public void testcons1() {
    assertThrows(IllegalArgumentException.class, () -> {
      Owl b1 = new Owl(Bird_list.HAWKS,"Sharp eyes",false,2, Food.INSECTS);
    });
  }


}
