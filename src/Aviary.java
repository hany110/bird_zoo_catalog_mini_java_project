import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aviary {

    private Integer cageSize = 0;
    private Integer cageCapacity;

    private static Integer MAX_BIRD_COUNT = 5;

    private static final Random RANDOM = new Random();
    private static Integer id = 0;

    public Integer ID;

    private List<Bird> birds;
    private String location;


    /*
    Constructor to create new Aviary
     */
    public Aviary (int cageCapacity) throws IllegalArgumentException
    {
        if (cageCapacity<0 || cageCapacity >5){
            throw new IllegalArgumentException("Number should be positive");
        }
        this.cageCapacity = cageCapacity;
        birds = new ArrayList<>();
        this.ID = Aviary.id +1;
        Aviary.id += 1;
        this.location = "["+'0'+","+ID+"]";

    }

    /*
    Get the location of the aviary
    @returns location
     */
    public String getLocation()
    {
        return this.location;

    }

    /*
    Method to check the type of the bird before adding it into the aviary
    Birds of type - Flightless birds, Bird of prey and Waterfowl birds should be placed in
    different aviaries and not mixed together with other birds

    @return true or falls if the bird can be added to the current aviary

     */
    public boolean checkBird(Bird birdToAdd)
    {
        Type addBirdType;
        addBirdType = birdToAdd.getClass();
        boolean isBirdToAddRestricted = (birdToAdd instanceof BirdsOfPrey || birdToAdd instanceof FlightlessBird || birdToAdd instanceof Waterfowl);
        for (Bird birdInAviary: this.getBirds())
        {
            Type presentBirdType;
            presentBirdType = birdInAviary.getClass();
            boolean isBirdInAviaryRestricted = (birdInAviary instanceof BirdsOfPrey || birdInAviary instanceof FlightlessBird || birdInAviary instanceof Waterfowl);

            if (isBirdToAddRestricted | isBirdInAviaryRestricted)
            {
                if (addBirdType != presentBirdType)
                {
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Add birds to the aviary
    @return true if the bird is added in the current aviary, else false
     */
    public boolean addBird(Bird bird)
    {
        if(cageSize<cageCapacity) {

            if (this.checkBird(bird))
            {
                birds.add(bird);
                cageSize++;
                return true;
            }
        }
        return false;
    }

    /*
    Get bird names present in the current aviary
    @return String of bird names
     */
    public String getBirdNames()
    {
        String returnString = "";

        for(Bird a: this.birds)
        {
            returnString += a.getType() +" ";

        }
        return returnString;
    }

    /*
    Get the list of birds in the current aviary
    @return List of enum with bird names
     */
    public List<Bird> getBirds(){
        return this.birds;
    }

    /*
    Get the ID of the aviary. This is unique to every aviary
    @returns aviary id number
     */
    public Integer getId()
    {

        return ID;
    }

    /*
    Get the bird name and its characteristics,
    for all the birds in the aviary
    @returns string with bird name and its characteristics
     */
    public String describeBirds()
    {
        String returnString = "";
        for (Bird a: this.birds)
        {
            if (a.getCharacteristics() != null || !a.getCharacteristics().isEmpty()){
                returnString += a.getType() + ": " + a.getCharacteristics() + "\n";
            }
        }
        return returnString;
    }

}
