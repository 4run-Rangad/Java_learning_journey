import java.util.Set;
import java.util.HashSet;
public class set{
    public static void main(String[] a){
        Set<Integer> nums = new HashSet<>();
        nums.add(3);
        nums.add(7);
        nums.add(4);
        nums.add(3);
        System.out.println(nums);
    }
}