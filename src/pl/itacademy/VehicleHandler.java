package pl.itacademy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class VehicleHandler implements InvocationHandler {
    private IVehicle vehicle;

    public VehicleHandler(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("VehicleProxy: Start of " + method.getName());
        method.invoke(vehicle, args);
        System.out.println("VehicleProxy: End of " + method.getName());
        return null;
    }
}
