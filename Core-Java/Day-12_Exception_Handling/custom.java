//Custom Exception
class InvalidAgeException extends Exception{
    //custom message can be created here
    public InvalidAgeException(String str){
        super(str);
    }
}
class Person{
    int age;
    public void drive(int age){
        try{
            this.age = age;
            if(this.age <18) throw new InvalidAgeException("That is illegal");
            else System.out.println("Driving.. ");
        }
        catch(InvalidAgeException e){
            System.out.println("Underaged should not drive." + e.getMessage());
        }
    }
}
public class custom{
    public static void main(String[] a){
        Person p = new Person();
        p.drive(9);
    }
}