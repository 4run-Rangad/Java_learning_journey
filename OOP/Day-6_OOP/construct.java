class Car{
    int price,seat;
    String name = "";
    Car(){
        //Default constructor, only have to create it when we have also created parameterized constructor
    }
    Car(String name, int seat, int price){
        this.name = name;
        this.seat = seat;
        this.price = price;
    }
    public void info(){
        System.out.println("Name: "+ name);
        System.out.println("No. of seats: "+ seat);
        System.out.println("Price: "+ price);
    }
}
public class construct{
    public static void main(String[] a){
        Car c1 = new Car();//Default constructor
        c1.name = "Honda City";
        c1.seat =4;
        c1.price = 1500000;
        Car c2 = new Car("Hyundai Venue", 4, 1100000);
        c1.info();
        System.out.println();
        c2.info();
    }
}