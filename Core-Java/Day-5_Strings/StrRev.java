public class StrRev{
    public static String RevString(String str){
        int len = str.length();
        String rev = "";
        for(int i=len-1 ; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        String str = "Hello";
        System.out.print(RevString(str));
     }
}