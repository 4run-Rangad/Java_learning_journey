import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Student implements Serializable{
    int rollNo;
    String name;
}

public class Serializationdemo{
    public static void main(String[] a){
        Student s1 = new Student();
        s1.rollNo = 21;
        s1.name = "Kris";
        String fileName = "test.txt";
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object saved in a file");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}