import java.util.ArrayList;

/*
The below class Bird implements from the interface IBird
This class keeps track of different birds and its attributes
 */
abstract public class Bird implements IBird {
    //static variable
    private static Integer BIRD_COUNT = 0;
    //instance variables
    private Bird_list name;
    private String characteristic;
    private Boolean extinct;
    private Integer wings;
    private ArrayList<Food> food = new ArrayList<Food>();



    /*
    Call constructor to initiate Bird class object
     */
    public Bird (Bird_list name, String characteristic, Boolean extinct, Integer wings,Food... food) throws IllegalArgumentException {


        if (characteristic == null || "".equals(characteristic)) {
            throw new IllegalArgumentException("The characteristic string cannot be null or an empty "
                + "string.");
        }


        if (wings != (int)wings) {
            throw new IllegalArgumentException("The wings is an integer");
        }

        if (wings <0 || wings >2) {
            throw new IllegalArgumentException("Wings is in range 0-2");
        }

        for (Food i : food) {
            if (i == null || "".equals(i)) {
                throw new IllegalArgumentException("The food string cannot be null or an empty "
                    + "string.");
            }
        }


        this.name = name;
        this.characteristic = characteristic;
        this.extinct = extinct;
        this.wings = wings;
        for (Food i : food) {
            this.food.add(Food.valueOf(String.valueOf(i)));
        }
        BIRD_COUNT += 1;

    }

    public String toString()
    {
        return name + "," + characteristic + "," + extinct + "," + wings + "," + food;
    }

    /*
    Get the list of foods the bird eats
    @returns List of Enum food types
     */
    public ArrayList<Food> getFood() {

        return this.food;
    }

    /*
    Get the name of the bird
    @returns Enum of bird name
     */

    public Bird_list getType() {
        return this.name;
    }


    /*
    Get the characteristics of the bird
    @returns string representing the characteristics of the bird
     */
    public String getCharacteristics() {
        return this.characteristic;
    }

    /*
    Get if the bird is extinct or not
    @returns boolean value true or false depending on if the bird is extinct
     */
    public Boolean getIsExtinct() {
        return this.extinct;
    }

    /*
    Get the number of wings the bird has
    @returns number of wings of the bird
     */
    public Integer getWings() {
        return this.wings;
    }

    abstract public String getFavWord();

    abstract public Integer getNoOfWords();


}


