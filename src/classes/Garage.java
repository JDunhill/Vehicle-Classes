package classes;

import java.util.ArrayList;
import java.util.*;

public class Garage {

    private static List<Vehicle> vehicleList = new ArrayList<>();

    public static float bill = 0;

    public Garage() {


    }

    public static boolean storeVehicle(Vehicle v) {

        return vehicleList.add(v);

    }

    public static float getBill() {
        return bill;
    }

    public static void setBill(float bill) {
        Garage.bill = bill;
    }

    public static void removeVehicleId(int id) {

        for(int v = 0; v < vehicleList.size(); v++) {
            Vehicle vh = vehicleList.get(v);
            if(vh.getId() == id) {
                vehicleList.remove(v);
            }
        }
    }

    public void removeVehicleType(String type) {
        boolean deleted = false;
        for (int i = 0; i < vehicleList.size(); i++) {
            Vehicle v = vehicleList.get(i);
            if (type.equals("car") && v instanceof Car) {
                vehicleList.remove(i);
            }
            else if (type.equals("van") && v instanceof Van) {
                vehicleList.remove(i);
            }
            else if (type.equals("bike") && v instanceof Bike) {
                vehicleList.remove(i);
            }
        }
    }


    public static float fixVehicle(int id) {
        float price = 0;
        for (int v = 0; v < vehicleList.size(); v++) {
            Vehicle vh = vehicleList.get(v);
            if (vh.getId() == id) {
                price = vh.getPrice();
            }
        }
        return price;
    }

    public static float calculateBill() {

        for (Vehicle i : vehicleList) {
                bill += i.getPrice();
            }
        return bill;

        }

    public static void emptyGarage() {
        for (Vehicle i : vehicleList) {
            vehicleList.remove(i);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vehicle vehicle: vehicleList) {
            sb.append("ID: ").append(vehicle.getId()).append(" , Price: ").append(vehicle.getPrice()).append("\n");
        }
        return sb.toString();
    }
}
