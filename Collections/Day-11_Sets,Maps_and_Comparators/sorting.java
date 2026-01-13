import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
    String name;
    int rollNo;
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public String toString(){
        return name+ " :("+rollNo+") ";
    }
    public int compareTo(Student that){
        return Integer.compare(this.rollNo,that.rollNo);
    }
}
public class sorting{
    public static void main(String[] a){
        List<Student> stud = new ArrayList<>();
        stud.add(new Student("Arun", 3));
        stud.add(new Student("Ajay", 1));
        stud.add(new Student("Sanju", 2));
        stud.add(new Student("Akshay", 5));
        System.out.println(stud);
        //sorting by rollNo using comparator
        Comparator<Student> names = new Comparator<Student>(){
            public int compare(Student i, Student j){
                return i.name.compareTo(j.name);
            }
        };
        Collections.sort(stud);
        System.out.println("Sorting by RollNo: "+stud);
        stud.sort(names);
        System.out.println("Sorting by Name: "+stud);
    }
}