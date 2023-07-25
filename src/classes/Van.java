package classes;

public class Van extends Vehicle {

    int storageCapacity;


    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void drive(int distance) {
        System.out.println("Sorry, this van has terrible efficiency. You only made it " + (distance/2) + " miles.");
    }

    public Van(boolean isBroken, float price, int id) {
        super(isBroken, 4, price, id);
    }


}
