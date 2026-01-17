import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

class Student implements Serializable{
    int rollNo;
    String name;
}

public class Deserializationdemo{
    public static void main(String[] a){
        String fileName = "test.txt";
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student obj = (Student)ois.readObject();
            System.out.println(obj.rollNo);
            System.out.println(obj.name);
            ois.close();
            fis.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
}