import java.util.Arrays;
public class anagram{
    public static void main(String[] a){
        String s1 = "listen";
        String s2 = "silent";
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean isAnagram = Arrays.equals(a1,a2);
        System.out.println(isAnagram);
    }
}