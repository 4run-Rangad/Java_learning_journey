//Throw, Throws practice
class A{
    void divide(int i, int j){
        try{
        j = j/i;
        if(j==0)
         throw new ArithmeticException("Don't want Zero output.");
        }
        catch(ArithmeticException e){
            j = 1;
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println(j);
    }
    void show() throws ClassNotFoundException {
        Class.forName("Example");
    }
}
public class demo{
    public static void main(String[] a){
        A obj = new A();
        obj.divide(8,0);
        try{
        obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("Error: "+ e);
        }
    }
}