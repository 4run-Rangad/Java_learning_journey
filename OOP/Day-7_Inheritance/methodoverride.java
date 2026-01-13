class Shape{
    int edge;
    int area(){
        int ar = edge*edge;
        return ar;
    }
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    int area(){
        int ar = (22*(radius*radius))/7;
        return ar; 
    }
} 
public class methodoverride{
    public static void main(String[] a){
        Circle c = new Circle(7);
        System.out.println("Area of circle of radius "+ c.radius+ " is: "+ c.area());
    }
}