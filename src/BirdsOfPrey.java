import java.util.ArrayList;

public class BirdsOfPrey extends Bird{
    //Static variable
    private static Integer BIRD_COUNT = 0;
    private Enum<Bird_list> name;

    /*
    Constructor to initialize Birds of Prey object
    and to check if valid type of bird is passed
    else throw illegal exception
     */

    public BirdsOfPrey(Bird_list name, String characteristic, Boolean extinct, Integer wings,Food... food)
    {
        super(name, characteristic, extinct, wings,food);

        if(name == Bird_list.HAWKS || name == Bird_list.EAGLES || name == Bird_list.OSPREY)
        {
            BIRD_COUNT += 1;
        }
        else
        {
            throw new IllegalArgumentException("Incorrect bird type");
        }
    }

    /*
    Method to return name of the bird
    @returns Bird_list enum of names
     */
    public Enum<Bird_list> getName()
    {
        return this.name;
    }

    @Override
    public String getFavWord() {
        return null;
    }

    @Override
    public Integer getNoOfWords() {
        return null;
    }
}
