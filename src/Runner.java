import classes.*;

public class Runner {

    public static void main(String[] args) {

        Vehicle transit = new Van(false, 3.5F, 1);
        transit.drive(4);
        Garage.storeVehicle(transit);
        Vehicle roadBike = new Bike(1.5F, 2);
        Garage.storeVehicle(roadBike);
        roadBike.drive(3);
        Vehicle bmw = new Car(6.5F, 3);
        bmw.drive(6);
        Garage.storeVehicle(bmw);

        System.out.println(Garage.calculateBill());

        Garage.removeVehicleId(1);
        Garage.setBill(0);

        System.out.println(Garage.calculateBill());

        Garage.fixVehicle(1);
        System.out.println("If you fix this vehicle, the cost will be: " + Garage.fixVehicle(1));
        Garage.emptyGarage();

    }
}
