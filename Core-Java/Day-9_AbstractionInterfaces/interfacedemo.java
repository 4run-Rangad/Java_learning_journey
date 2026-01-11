interface Drawable{
    void draw();
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing a Circle..");
    }
}
class Square implements Drawable{
    public void draw(){
        System.out.println("Drawing a Square..");
    }
}
public class interfacedemo{
    public static void main(String[] a){
        Circle c = new Circle();
        c.draw();
        Square s = new Square();
        s.draw();
    }
}