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

  @Test
  public void testConstructor1() {
    assertThrows(IllegalArgumentException.class, () -> {
      Parrot b2 = new Parrot(Bird_list.HAWKS,"Multiple species",false,2,85,"wonderful", Food.BERRIES);
    });
  }

  @Test
  public void testsetword() {
    b1.setWords(3);
  }

  @Test
  public void testsetword1() {
    assertThrows(IllegalArgumentException.class, () -> {
      b1.setWords(-3);
    });
  }
  @Test
  public void testfavword() {
    b1.setFavWord("asdfsadfsdfsf asdf");
  }

  @Test
  public void testfavword1() {
    assertThrows(IllegalArgumentException.class, () -> {
      b1.setFavWord("");
    });
  }

  }
