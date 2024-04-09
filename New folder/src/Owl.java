public class Owl extends Bird{
    private static Integer BIRD_COUNT = 0;

    //added food here
    public Owl(Bird_list name, String characteristic, Boolean extinct, Integer wings, Food... food)
    {
        super(name, characteristic, extinct, wings, food);

        if(name == Bird_list.OWLS)
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
