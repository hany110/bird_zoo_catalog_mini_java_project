import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the Parrot class.
 */

public class ParrotTest {
  Parrot b1 = new Parrot(Bird_list.GRAY_PARROT,"Multiple species",false,2,85,"wonderful",Food.BERRIES);

  @Test
  public void testConstructorValid() {
    Parrot b2 = new Parrot(Bird_list.GRAY_PARROT,"Multiple species",false,2,98,"lovely", Food.BERRIES);
  }

  /*
  Method to test if the input bird is of the same type as instance type.
  If not throw error
   */
  @Test
  public void testConstructor() {
    assertThrows(IllegalArgumentException.class, () -> {
      Parrot b2 = new Parrot(Bird_list.HAWKS,"Multiple species",false,2,85,"wonderful", Food.BERRIES);
    });
  }

  /*
  To test the number of words
   */
  @Test
  public void testSetWord() {
    b1.setWords(3);
  }

  /*
  Test illegal exception in number of words
   */
  @Test
  public void testSetWord1() {
    assertThrows(IllegalArgumentException.class, () -> {
      b1.setWords(-3);
    });
  }

  /*
  To set the favorite word of the bird
   */
  @Test
  public void testFavWord() {
    b1.setFavWord("asdfsadfsdfsf asdf");
  }


  /*
  To check if the favorite word is null or empty
  then return illegal Argument exception
   */
  @Test
  public void testFavWord1() {
    assertThrows(IllegalArgumentException.class, () -> {
      b1.setFavWord("");
    });
  }

  }
