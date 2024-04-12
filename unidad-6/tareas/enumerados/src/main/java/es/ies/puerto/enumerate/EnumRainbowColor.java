package es.ies.puerto.enumerate;

public enum EnumRainbowColor {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    PURPLE("Purple");

    private String value;


    /**
     * Default constructor of the enum
     */
     EnumRainbowColor() {}

    /**
     * Constrcutor of the enum
     * @param value
     */
     EnumRainbowColor(final String value){
        this.value=value;
     }

    /**
     * Getters
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
