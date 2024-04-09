abstract public class Waterbird extends Bird{
    private String waterBody;
    public Waterbird(Bird_list name, String characteristic, Boolean extinct, Integer wings, String waterBody, Food... food) {
        super(name, characteristic, extinct, wings, food);
        if (waterBody == null || "".equals(waterBody)) {
            throw new IllegalArgumentException("The waterbody string cannot be null or an empty "
                + "string.");
        }
        this.waterBody = waterBody;
    }

    public String getWaterBody()
    {
        return this.waterBody;
    }
}
