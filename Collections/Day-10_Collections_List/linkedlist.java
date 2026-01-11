import java.util.LinkedList;
public class linkedlist{
    public static void main(String[] a){
        LinkedList<String> names = new LinkedList<>();
        names.add("Arun");
        names.add("George");
        names.add("Tony");
        names.add("Frank");
        System.out.println(names);
        //To add at start of linked list
        names.addFirst("Raju");
        System.out.println(names);
        //add at last
        names.addLast("Donald");
        System.out.println(names);

        //Remove elements
        names.remove("Tony");
        System.out.println(names);
        //remove first
        names.removeFirst();
        System.out.println(names);
        //remove last
        names.removeLast();
        System.out.println(names);
    }
}