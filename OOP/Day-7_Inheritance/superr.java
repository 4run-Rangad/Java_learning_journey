//using super()
class A{
    A(){
        System.out.println("In class A");
    }
}
class B extends A{
    B(){
        System.out.println("In Class B");
    }
}
public class superr{
    public static void main(String[] a){
        B b =new B();
    }
}