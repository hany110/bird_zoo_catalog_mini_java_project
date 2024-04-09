import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the Aviary class.
 */



public class AviaryTest {

  Aviary av = new Aviary(5);
  BirdsOfPrey hawk = new BirdsOfPrey(Bird_list.HAWKS, "Sharp nose", false, 2, Food.OTHER_BIRDS, Food.INSECTS);
  FlightlessBird emu = new FlightlessBird(Bird_list.EMUS,"Lives on ground",true,0,Food.INSECTS,Food.SEEDS);
  Shorebird greatAuk = new Shorebird(Bird_list.GREAT_AUK, "Sharp eyes", false, 2, "Ocean", Food.INSECTS);

  /*
  Test the constructor

   */
  @Test
  public void testConstructor()
  {
    Aviary av = new Aviary(5);
  }


  /*
  Check if the capacity of each aviary is a positive number
   */
  @Test
  public void testCapacity() {
    assertThrows(IllegalArgumentException.class, () -> {
      Aviary av = new Aviary(-2);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      Aviary av = new Aviary(7);
    });
  }


  /*
  To check if the bird is added into the aviary
   */
  @Test
    public void addBird() {
      boolean addhawk = av.addBird(hawk);
      boolean addemu = av.addBird(emu);
      assertEquals("true", String.valueOf(addhawk));
      assertEquals("false", String.valueOf(addemu));
    }


  /*
  Check if the location of the bird is returned as String type
   */
  @Test
  public void getLocation()
{
  assertEquals("".getClass(),av.getLocation().getClass());
}

  /*
  Check if the aviary adds extinct birds
  Should return false
   */
  @Test
  public void checkBird()
  {
    boolean addHawk = av.addBird(hawk);
    assertEquals(false,av.checkBird(greatAuk));
  }

  /*
  Get the bird name of the bird added
   */
  @Test
  public void getBirdNames()
  {
    //assertEquals("",av.getBirdNames());
    boolean addHawk = av.addBird(greatAuk);
    assertEquals("GREAT_AUK ",av.getBirdNames());


  }

  /*
  Test description of all birds in the given aviary number.
  */
  @Test
  public void describeBirds() {
    boolean isbirdadded = av.addBird(hawk);
    String expected = "HAWKS: Sharp nose" + "\n";
    assertEquals(expected, av.describeBirds());

  }


  }

