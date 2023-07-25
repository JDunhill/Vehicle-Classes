package classes;

public class Vehicle {

    boolean isBroken = false;

    int numberOfWheels;

    float price;

    int id;



    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }


    public void drive(int distance) {
        System.out.println("You have driven " + distance + " miles!");
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle(boolean isBroken, int numberOfWheels, float price, int id) {
        this.isBroken = isBroken;
        this.numberOfWheels = numberOfWheels;
        this.price = price;
        this.id = id;
    }
}
