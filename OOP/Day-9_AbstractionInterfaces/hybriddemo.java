interface Engine{
    void startEngine();
}
abstract class Vehicle implements Engine{
    public void startEngine(){
        System.out.println("Starting Engine..");
    }
    public abstract void start();
}
class Car extends Vehicle{
    public void start(){
        startEngine();
        System.out.println("Car Starts.");
    }
}
public class hybriddemo{
    public static void main(String[] a){
        Car c = new Car();
        c.start();
    }
}