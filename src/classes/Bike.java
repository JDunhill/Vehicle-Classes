package classes;

public class Bike extends Vehicle{


    boolean hasEngine = false;




    @Override
    public void drive(int distance) {
        System.out.println("You're silly, a bike doesn't use fuel");
    }


    public Bike(float price, int id) {
        super(false, 2, price, id);
    }
}
