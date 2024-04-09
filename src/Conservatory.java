import java.util.*;


public class Conservatory {

    private static Integer MAX_AVIARIES = 20;
    private  static Integer aviary_count = 0;
    private static List<Aviary> aviary = new ArrayList<>();

    private List<Food> foodName = new ArrayList<>();

    //to keep track of which bird is in which aviary.
    private HashMap<Bird_list, Set<Integer>> aviary_map = new HashMap<Bird_list,Set<Integer>>();

    private HashMap<String,String> aviaryLocation = new HashMap<String,String>();

    private static HashMap<String, Integer> food_count = new HashMap<String,Integer>();



    /*
    Method to add the birds into the Aviaries
    along with the check for extinct or not
     */
    public boolean addBird(Bird bird)
    {
        boolean isAdded = false;
        if (!bird.getIsExtinct()) {
            for (Aviary a : getAviaries()) {
                isAdded = a.addBird(bird);

                if (isAdded) {
                    this.aviaryLocation.put("Aviary_"+a.getId(),a.getLocation());

                    Set<Integer> value = this.aviary_map.get(bird.getType());
                    if (value == null) {
                        value = new HashSet<Integer>();
                    }
                    value.add(a.getId());
                    this.aviary_map.put(bird.getType(), value);
                    Conservatory.manageFoodCount(bird);
                    break;
                }
            }
            if (!isAdded) {
                if (Conservatory.aviary_count < Conservatory.MAX_AVIARIES) {
                    Aviary av;
                    av = this.addAviary();
                    isAdded = av.addBird(bird);
                    if (isAdded) {

                        this.aviaryLocation.put("Aviary_"+av.getId(),av.getLocation());
                        Set<Integer> value;
                        value = this.aviary_map.get(bird.getType());
                        if (value == null) {
                            value = new HashSet<Integer>();
                        }
                        value.add(av.getId());

                        this.aviary_map.put(bird.getType(), value);
                        Conservatory.manageFoodCount(bird);

                    }

                }
                else {
                    throw new IllegalArgumentException("Aviary count has reached Max Limit");
                }
            }
        }
        return isAdded;
    }


    /*
    Create a aviary which can house 5 birds
    returns new Aviary
     */
    protected Aviary addAviary()
    {
        Aviary av = new Aviary(5);

        //add the newly created aviary in the aviary tracking list
        this.aviary.add(av);
        Conservatory.aviary_count ++;
        return av;
    }


    /*
    Method to have track of count of foods for
    all the birds in the conservatory.
    @returns null
     */
    public static void manageFoodCount(Bird bird)
    {
        ArrayList<Food> birdFood = bird.getFood();
        for(int i = 0;i<birdFood.size();i++)
        {
            Integer food_val = Conservatory.food_count.get(String.valueOf(birdFood.get(i)));
            if(food_val!=null)
            {
                food_val += 1;
                Conservatory.food_count.put(String.valueOf(birdFood.get(i)),food_val);
            }
            else
            {
                Conservatory.food_count.put(String.valueOf(birdFood.get(i)),1);
            }
        }

    }


    /*
    Method to get the aviary number for input bird
    @retuns string with set of aviary id's in which the input bird is housed
     */
    public String getAviaryNumber(Bird_list birdName)
    {
        return String.format("%s is in following aviaries : %s",
                birdName,(aviary_map.get(birdName)).toString());

    }

    /*
    Method to display map showing birds
    and the aviaries they are present in
    @returns hashmap having keys as birds and values as set of aviary id's
    in which the bird is housed
     */
    public HashMap<Bird_list, Set<Integer>> getAviaryMap()
    {
        return aviary_map;
    }

    /*
    Method to display details regarding the bird
    @returns description and name of all the birds that are housed in the
    aviary given by the aviary id
     */

    public String getAviaryDescription(Integer id)
    {
        for (Aviary a : this.getAviaries())
        {
            if (a.getId() == id){
                String aviaryDescription = a.describeBirds();
                return aviaryDescription;
            }
        }
        return "Empty Aviary";
    }

    /*
    Displays Aviary number, its location and the birds it houses
    returns string with above details
     */
    public String getAviaryLocation()
    {
        String returnString = "";
        for (Aviary a : this.getAviaries())
        {
            String returnBirds = a.getBirdNames();
            returnString += "Aviary_"+a.getId()+ ": Location - "+a.getLocation()+",Birds - "+ returnBirds+"\n";


        }
        return returnString;
    }


    /*
   Method to display hashmap containing
   food names and corresponding counts
   @returns hashmap with food names as key and their quantities as value
    */
    public HashMap<String,Integer> getFoodCount()
    {
        return food_count;
    }

    /*
    Method to get list of already created aviaries
    @returns list of all created aviaries
     */
    public static List<Aviary> getAviaries() {
        return aviary;
    }


    /*
    To alphabetically arrange all the birds in the conservatory along
    the location of the aviary which they belong to
    @returns String with bird name(alphabetically) and corresponding location
     */

    public static String getBirdLocation()
    {
        HashMap<String,List<String>> birdLoc = new HashMap<>();
        for(Aviary a : getAviaries())
        {
            String birdName = a.getBirdNames();
            String[] birdList = birdName.split(" ");
            for(String s : birdList) {

                List<String> value = birdLoc.get(s);

                if (value == null) {
                    value = new ArrayList<>();
                }
                value.add(a.getLocation());
                birdLoc.put(s, value);
            }

        }
        TreeMap<String,List<String>> sorted_list = new TreeMap<>(birdLoc);
        String returnString = "";
        for(Map.Entry<String,List<String>> entry : sorted_list.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();

            returnString += key + " => " + value + "\n";
        }
        return returnString;

    }



}
