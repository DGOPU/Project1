package GITProjects;

abstract class Vehicle1 {
    private char vehicleType;
    public abstract void move ();
}

public class Truck1 extends Vehicle1 {
    private int truckNo;


    public static void main(String args[]) {
        Truck1 mahindra= new Truck1();
        mahindra.move();
    }

    @Override
    public void move() {

    }
}