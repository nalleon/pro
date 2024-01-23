package ies.puerto.abstrac;

public abstract class RegularesAbstract {
    private float base;
    private float heigth;

    public RegularesAbstract (){}
    public RegularesAbstract(float base, float heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }


    public float calculateArea(){
        return base*heigth;
    }
}
