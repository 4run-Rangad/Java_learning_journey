public class duplicatechar{
    public static void main(String[] a){
        String str = "Tomorrow";
        int len = str.length() ;
        for(int i = 0; i<len; i++){
            char c = str.charAt(i);
            int count = 0;
            for(int j = 0; j<len;j++){
                if(str.charAt(j)==c){
                    count++;
                }
            }
            if(count>1 && str.indexOf(c)==i){
                    System.out.println("Character: "+c+ " appeared " + count + " Times");
                }
        }
    }
}