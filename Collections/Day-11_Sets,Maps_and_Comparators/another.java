//Storing custom object in a set
import java.util.Set;
import java.util.HashSet;
class Student{
    String name;
    int rollNo;
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public String toString(){
        return name+ " ,("+rollNo+") ";
    }
    @Override
    public boolean equals(Object obj){
        return this.rollNo==((Student)obj).rollNo;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(rollNo);
    }
}
public class another{
    public static void main(String[] a){
        Set<Student> stud = new HashSet<>();
        stud.add(new Student("John" , 1));
        stud.add(new Student("Jerry" , 2));
        stud.add(new Student("John" , 1));
        stud.add(new Student("Tom" , 3));
        System.out.println(stud);
    }
}