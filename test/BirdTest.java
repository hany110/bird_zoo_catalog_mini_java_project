import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the Bird class.
 */


public class BirdTest {


  @Test
  public void testConstructorValid() {
    BirdsOfPrey b1 = new BirdsOfPrey(Bird_list.HAWKS, "Sharp nose", Boolean.FALSE, 2,
        Food.OTHER_BIRDS, Food.INSECTS);
    Shorebird sb = new Shorebird(Bird_list.AFRICAN_JACANA, "live near water", Boolean.FALSE, 2,
        "wetlands", Food.LARVAE, Food.FISH, Food.OTHER_BIRDS);
    Waterfowl waterfowl = new Waterfowl(Bird_list.SWANS, "Swims", Boolean.FALSE, 2, "River",
        Food.FISH);
  }


  /**
   * Tests whether constructor throws an exception when invalid arguments are passed.
   */
  @Test
  public void testConstructionInvalid() {
    assertThrows(IllegalArgumentException.class, () -> {
      BirdsOfPrey b1 = new BirdsOfPrey(Bird_list.HAWKS, "", Boolean.FALSE, 2,
          Food.OTHER_BIRDS, Food.INSECTS);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      BirdsOfPrey b1 = new BirdsOfPrey(Bird_list.HAWKS, "Sharp nose", Boolean.FALSE, -2,
          Food.OTHER_BIRDS, Food.INSECTS);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      BirdsOfPrey b1 = new BirdsOfPrey(Bird_list.HAWKS, "Sharp nose", Boolean.FALSE, -2);
    });
  }

  @Test
  public void testEvaluateValid() {
    BirdsOfPrey b1 = new BirdsOfPrey(Bird_list.HAWKS, "Sharp nose", Boolean.FALSE, 2,
        Food.OTHER_BIRDS, Food.INSECTS);
    assertEquals("HAWKS,Sharp nose,false,2,[OTHER_BIRDS, INSECTS]", b1.toString());
  }

  }