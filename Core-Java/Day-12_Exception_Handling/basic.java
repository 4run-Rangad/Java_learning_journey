public class basic{
    public static void main(String[] a){
        int i=2, j=1;
        int[] nums = new int[5];
        try{
            int result = i/j;
            System.out.println("Result of division: "+result);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}