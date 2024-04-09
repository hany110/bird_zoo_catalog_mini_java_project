public class Parrot extends Bird{

    private static Integer BIRD_COUNT = 0;

    //instance variables
    Integer numberOfWords;
    String favWord;

    public Parrot(Bird_list name, String characteristic, Boolean extinct, Integer wings, Integer numberOfWords, String favWord,Food... food)
    {
        super(name, characteristic, extinct, wings, food);
        if(name == Bird_list.PARROTS || name == Bird_list.GRAY_PARROT || name == Bird_list.ROSE_RING_PARAKEET || name == Bird_list.SULFUR_CRESTED_COCKATOO)
        {
            this.numberOfWords = 90;
            this.favWord = "fantastic";
            BIRD_COUNT += 1;
        }
        else
        {
            throw new IllegalArgumentException("Incorrect bird type");
        }

    }

    public void setWords(Integer numberOfWords)
    {
        if (numberOfWords<0){
            throw new IllegalArgumentException("Number should be +ve");
        }
        this.numberOfWords = numberOfWords;
    }

    public void setFavWord(String favWord)
    {
        if (favWord == null || "".equals(favWord)) {
            throw new IllegalArgumentException("The favword string cannot be null or an empty "
                + "string.");
        }
        this.favWord = favWord;
    }

    /*
    Get the number of words in the birds vocabulary
     */

    public Integer getWords() {
        return this.numberOfWords;
    }

    /*
    Get the favorite word from the birds vocabulary
     */
    public String getFavWord() {
        return this.favWord;
    }

    @Override
    public Integer getNoOfWords() {
        return this.numberOfWords;
    }


}
