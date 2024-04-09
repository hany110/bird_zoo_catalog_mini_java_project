public class Shorebird extends Waterbird{
    private static Integer BIRD_COUNT = 0;
    private String waterBody;



    public Shorebird(Bird_list name, String characteristic, Boolean extinct, Integer wings, String waterBody, Food... food) {
        super(name, characteristic, extinct, wings, waterBody ,food);
        if(name == Bird_list.GREAT_AUK || name == Bird_list.HORNED_PUFFIN || name == Bird_list.AFRICAN_JACANA)
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
