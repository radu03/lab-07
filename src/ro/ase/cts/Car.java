package ro.ase.cts;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Vroom.");
    }
}
