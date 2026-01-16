import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
public class basic{
    public static void main(String[] a){
        //to create file
        File myfile = new File("test.txt");
        try{
        myfile.createNewFile();
        System.out.println("File Created.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        //To write in a file
        try{
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Writing in a file.");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        //To read from a file
        try{
            Scanner sc = new Scanner(myfile);
            System.out.println(sc.nextLine());
        }
        catch(FileNotFoundException e){
           e.printStackTrace();
        }
    }
}