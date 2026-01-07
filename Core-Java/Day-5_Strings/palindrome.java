public class palindrome{
    public static void main(String[] args){
        String str = "madam";
        boolean isPalindrome = true;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1 - i)){
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);
    }
}