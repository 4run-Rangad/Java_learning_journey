import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class arraylist{
    public static void main(String[] a){
        List<String> fruits = new ArrayList<String>();
        //insert
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);
        //update
        fruits.set(1, "Water-Melon");
        System.out.println("After Update: " +fruits);
        //delete
        fruits.remove("Orange");
        System.out.println("After deletion: "+fruits);
        //Iterate using for loop
        System.out.println("Iterate using for loop: ");
        for(int i = 0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
        //using for each
        System.out.println("using for each: ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        //using iterator
        System.out.println("using iterator: ");
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}