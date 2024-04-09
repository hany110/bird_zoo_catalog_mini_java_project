import java.util.ArrayList;

/*
IBird represents the data regarding each bird,
like the bird type,its characteristics, if it is extinct or not,
number of wings, the food it eats, number of words it can speak, favourite word,
name of the water body

 */
public interface IBird {

    /*
    Get the name of the Bird
    @returns type of the bird
     */
    private String getType() {
        return null;
    }

    /*
    Get the characteristics of the Bird
    @returns characteristics
     */
    private String getCharacteristics() {
        return null;
    }

    /*
    Get if the bird is extinct or not
    returns true or false
     */
    private Boolean getIsExtinct() {
        return null;
    }

    /*
    Get the list of food items the birds eat
    returns List of food items
     */
    private ArrayList<String> getFood()
    {
        return null;
    }

    /*
    Get the number of wings a bird has
    @returns number of wings
     */
    private Integer getWings() {
        return null;
    }

    /*
    Get the number of words a Parrot can speak
    @returns number of words
     */
    private Integer getWords() {
        return null;
    }

    /*
    Get the favourite word of the Parrot
    @returns favourite word
     */
    private String getFavWord() {
        return null;
    }

    /*
    Get the name of the water body the bird stays in
    @returns name of the water body
     */
    private String getWaterName() {
        return null;
    }
}
