package pl.itacademy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proxy pattern:");
        IVehicle car = new Car("polonez");
        IVehicle carProxy = new VehicleProxy(car);
        carProxy.start();
        carProxy.forward();
        carProxy.reverse();
        carProxy.stop();

        System.out.println("\nDynamic proxy\n");
        IVehicle c = new Car("polonez");
        ClassLoader cl = IVehicle.class.getClassLoader();
        IVehicle v = (IVehicle) Proxy.newProxyInstance(cl,
                new Class[] {IVehicle.class}, new VehicleHandler(c));
        v.start();
        v.forward();
        v.reverse();
        v.stop();
    }
}
