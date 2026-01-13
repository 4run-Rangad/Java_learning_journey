abstract class Shape{
    public abstract void area();
}
class Circle extends Shape{
    public int a;
    public void area(){
        double ar = (22 *(a*a))/7;
        System.out.println("Area: "+ ar);
    }
}
public class abstractdemo{
    public static void main(String[] a){
        Circle c = new Circle();
        c.a = 7;
        c.area();
    }
}