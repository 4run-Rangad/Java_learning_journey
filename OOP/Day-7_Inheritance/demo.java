class A{
    void show(){
        System.out.println("In class A");
    }
}
class B extends A{
    void show(){
        System.out.println("In class B");
    }
}
public class demo{
    public static void main(String[] a){
        A obj =new B();
        obj.show();
    }
}