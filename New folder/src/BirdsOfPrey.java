import java.util.ArrayList;

public class BirdsOfPrey extends Bird{
    //Static variable
    private static Integer BIRD_COUNT = 0;
    private Enum<Bird_list> name;

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
