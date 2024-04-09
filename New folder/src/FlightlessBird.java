public class FlightlessBird extends Bird{
    private static Integer BIRD_COUNT = 0;

    public FlightlessBird(Bird_list name, String characteristic, Boolean extinct, Integer wings, Food... food)
    {
        super(name, characteristic, extinct, wings,food);

        if(name == Bird_list.EMUS || name == Bird_list.MOAS || name == Bird_list.KIWIS)
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
