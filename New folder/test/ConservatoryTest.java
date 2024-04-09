import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


/**
 * A JUnit test class for the conservatory class.
 */



public class ConservatoryTest {
    static Conservatory conservatory;
    static BirdsOfPrey hawk;
    static Shorebird greatAuk;
    static BirdsOfPrey hawk2;
    static BirdsOfPrey hawk3;
    static Parrot parrot;
    static FlightlessBird emu;
    static boolean addHawk;
    static boolean addGreatAuk;
    static boolean addHawk2;
    static boolean addHawk3;
    static boolean addParrot;
    static boolean addEmu;


    @BeforeClass
    public static void setUpClass() {
        conservatory = new Conservatory();
        hawk = new BirdsOfPrey(Bird_list.HAWKS, "Sharp nose", false, 2, Food.OTHER_BIRDS, Food.INSECTS);
        greatAuk = new Shorebird(Bird_list.GREAT_AUK, "Sharp eyes", false, 2, "Ocean", Food.INSECTS);
        hawk2 = new BirdsOfPrey(Bird_list.HAWKS, "Sharp nose", false, 2, Food.OTHER_BIRDS, Food.INSECTS);
        hawk3 = new BirdsOfPrey(Bird_list.HAWKS, "Sharp nose", false, 2, Food.OTHER_BIRDS, Food.INSECTS);
        parrot = new Parrot(Bird_list.GRAY_PARROT, "Talks alot", false, 2, 96, "beautiful", Food.BERRIES, Food.BUDS);
        emu = new FlightlessBird(Bird_list.EMUS, "Lives on ground", true, 0, Food.INSECTS, Food.SEEDS);

        addHawk = conservatory.addBird(hawk);
        addGreatAuk = conservatory.addBird(greatAuk);
        addHawk2 = conservatory.addBird(hawk2);
        addHawk3 = conservatory.addBird(hawk3);
        addParrot = conservatory.addBird(parrot);
        addEmu = conservatory.addBird(emu);

    }
    /*
    Testing if the bird is successfully added to the aviary
     */

    @Test
    public void addBird() {
        assertEquals("true", String.valueOf(addHawk));
        assertEquals("true", String.valueOf(addGreatAuk));
        assertEquals("false", String.valueOf(addEmu));

    }

    /*
    Test the size of actually created aviary
     */

    @Test
    public void getAviarySize() {
        assertEquals(2, conservatory.getAviaries().size());
    }

    /*
    Testing if restricted birds are in different aviaries
    Here GreatAuk and Gray Parrot can be put in same aviary

     */

    @Test
    public void getAviaryMap() {
        assertEquals(true, ((conservatory.getAviaryMap()).get("GREAT_AUK")) == ((conservatory.getAviaryMap().get("GRAY_PARROT"))));
    }


    /*
    Total quantity of each food item in the consveratory
     */

    @Test
    public void getFoodCount() {
        assertEquals(false, conservatory.getFoodCount().isEmpty());
        assertEquals("{OTHER_BIRDS=3, BERRIES=1, INSECTS=4, BUDS=1}", String.valueOf(conservatory.getFoodCount()));

    }

    /*
    Check if Hawks are in which aviary number
     */

    @Test
    public void getAviaryNumber() {

        assertEquals("HAWKS is in following aviaries : [9]", String.valueOf(conservatory.getAviaryNumber(Bird_list.HAWKS)));
    }

    /*
    Test description of all birds in the given aviary number.
     */

    @Test
    public void getAviaryDescription() {
        assertEquals("HAWKS: Sharp nose" + "\n" +
                "HAWKS: Sharp nose" + "\n" +
                "HAWKS: Sharp nose" + "\n", conservatory.getAviaryDescription(9));
    }

    /*
    Test the bird and the location of the aviary they are present in
     */

    @Test
    public void getBirdLocation() {
        String expected = "GRAY_PARROT => [[0,10]]" + "\n" + "GREAT_AUK => [[0,10]]" + "\n" + "HAWKS => [[0,9], [0,9], [0,9]]" + "\n";
        assertEquals(expected, conservatory.getBirdLocation());

    }


    @Test(expected = IllegalArgumentException.class)
    public void aviarySize() {
        for (int i = 0; i <= 100; i++) {
            conservatory.addBird(greatAuk);
        }
    }
}







