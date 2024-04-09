public class Waterfowl extends Waterbird{
    private static Integer BIRD_COUNT = 0;
    private String waterBody;

    /*
    Constructor to initialize Birds of Prey object
    and to check if valid type of bird is passed
    else throw illegal exception
     */

    public Waterfowl(Bird_list name, String characteristic, Boolean extinct, Integer wings, String waterBody, Food... food) {
        super(name, characteristic, extinct, wings, waterBody ,food);
        if(name == Bird_list.DUCKS || name == Bird_list.SWANS || name == Bird_list.GEESE)
        {
            BIRD_COUNT += 1;
        }
        else
        {
            throw new IllegalArgumentException("Incorrect bird type");
        }

    }

    /*
    Get the waterbody of the bird
    @returns string

    @Polymorphism example
     */

    public String getWaterBody()
    {
        return this.waterBody;
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
