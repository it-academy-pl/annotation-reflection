package pl.itacademy;

public class Main {

    public static void main(String[] args) {
        IVehicle car = new Car("polonez");
        IVehicle carProxy = new VehicleProxy(car);
        carProxy.start();
    }
}
