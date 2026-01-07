public class remduplicate{
    public static void main(String[] a){
        StringBuffer str = new StringBuffer("Tomorrow");
        int len = str.length() ;
        for(int i = 0; i<len; i++){
            char c = str.charAt(i);
            for(int j = i+1; j<len;j++){
                if(str.charAt(j)==c){
                    str.deleteCharAt(j);
                    len = str.length();
                }
            }
        }
        System.out.print(str);
    }
}