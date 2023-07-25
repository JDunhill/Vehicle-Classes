package classes;

public class Car extends Vehicle{


    boolean isSportsCar;

    String colour;

    float price;

    public boolean isSportsCar() {
        return isSportsCar;
    }

    public void setSportsCar(boolean sportsCar) {
        isSportsCar = sportsCar;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car(float price, int id) {
        super(false, 4, price, id);
    }
}
