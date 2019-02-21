package pl.itacademy;

public class Car implements IVehicle {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Car " + name + " started.");
    }

    @Override
    public void forward() {
        System.out.println("Car " + name  + " moved forward.");
    }

    @Override
    public void reverse() {
        System.out.println("Car " + name + " reversed.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + name + " stopped.");
    }
}
