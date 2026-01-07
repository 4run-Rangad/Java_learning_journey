//program to show the immutability of a String inn java
public class immute{
    public static void main(String[] a){
        String s1 = "Hello";
        s1.concat(" World");
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("Hello");
        s2.append(" World");
        System.out.println(s2); 
    }
}