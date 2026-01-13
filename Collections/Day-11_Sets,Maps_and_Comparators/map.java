import java.util.HashMap;
import java.util.Map;
public class map{
    public static void main(String[] a){
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Arun" , 45);
        students.put("Akshay" , 54);
        students.put("Arvind" , 67);
        students.put("Ajax" , 47);
        System.out.println(students);
        ///iterating using keyset()
        for(String key : students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }
        //using entrySet()
        for(Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}