public class vowandconso{
    public static void check( String str){
        int vow = 0, conso = 0;
        int len = str.length();
        for (int i =0; i<len; i++){
            if((str.charAt(i)== 'a') || (str.charAt(i)== 'e') || (str.charAt(i)== 'i') || (str.charAt(i)== 'o') || (str.charAt(i)== 'u') ){
                vow++;
            }
            else conso++;
        }
        System.out.print("Vowels: "+vow+ " and Consonants: "+conso);
    }
    public static void main(String[] args){
        String str = "Helllo";
        check(str);
    }
}