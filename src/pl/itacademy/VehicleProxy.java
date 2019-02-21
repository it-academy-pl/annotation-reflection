package pl.itacademy;

public class VehicleProxy implements IVehicle {
    private IVehicle vehicle;

    public VehicleProxy(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void start() {
        System.out.println("VehicleProxy: Begin of start()");
        vehicle.start();
        System.out.println("VehicleProxy: End of start()");

    }

    @Override
    public void forward() {
        System.out.println("VehicleProxy: Begin of forward()");
        vehicle.forward();
        System.out.println("VehicleProxy: End of forward()");
    }

    @Override
    public void reverse() {
        System.out.println("VehicleProxy: Begin of reverse()");
        vehicle.reverse();
        System.out.println("VehicleProxy: End of reverse()");
    }

    @Override
    public void stop() {
        System.out.println("VehicleProxy: Begin of stop()");
        vehicle.stop();
        System.out.println("VehicleProxy: End of stop()");
    }
}
