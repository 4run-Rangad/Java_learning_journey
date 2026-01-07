class Student{
    int id = 0, marks = 0;
    String name = " " ;
    public void details(){
        System.out.println("Student id: "+ id );
        System.out.println("Student name: "+ name );
        System.out.println("Marks obtained: "+ marks );
    }
}
class Employee{
    int id = 0, salary = 0;
    String name = " " ;
    public void details(){
        int ann = salary*12;
        System.out.println("Employee id: "+ id );
        System.out.println("Employee name: "+ name );
        System.out.println("Annual Salary: "+ ann );
    }
}
public class basicClass{
    public static void main(String[] a){
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Rico";
        s1.marks = 80;
        s1.details();
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Rick";
        e1.salary = 20000;
        e1.details();
    }
}