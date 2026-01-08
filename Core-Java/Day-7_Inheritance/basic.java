class Person{
    String name;
    int age;
}
class Student extends Person{
    int marks;
    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
     void details(){
        System.out.println("Name: "+ name);
        System.out.println("Age is: " + age);
        System.out.println("Marks: "+ marks);
    }
}
public class basic{
    public static void main(String[] a){
        Student s1 = new Student("Ram", 12, 80);
        s1.details();
    }
}