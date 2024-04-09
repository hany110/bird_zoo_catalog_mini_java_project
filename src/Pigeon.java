public class Pigeon extends Bird{
    private static Integer BIRD_COUNT = 0;

    /*
    Constructor to initialize Birds of Prey object
    and to check if valid type of bird is passed
    else throw illegal exception
     */
    public Pigeon(Bird_list name, String characteristic, Boolean extinct, Integer wings, Food... food)
    {
        super(name, characteristic, extinct, wings, food);

        if(name == Bird_list.PIGEONS || name == Bird_list.DOVES)
        {
            BIRD_COUNT += 1;
        }
        else
        {
            throw new IllegalArgumentException("Incorrect bird type");
        }
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
