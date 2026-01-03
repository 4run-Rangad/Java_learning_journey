public class methodoverload{
    public static int add(int x, int y){
        return x+y;
    }
    public static double add(double x, double y){
        return x+y;
    }
    public static void main(String[] args){
        System.out.println(add(4,5) + " "+ add(4.2,5.3));
    }
}