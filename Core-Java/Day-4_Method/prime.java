public class prime{
    public static void chkprime(int n){
        int flag = 0;
        for(int i=2;i<n;i++){
            if((n%i)==0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println(n + " is not Prime");
        }
        else System.out.println(n + " is Prime");
    }
    public static void main(String[] args){
        int p = 4;
        chkprime(p);
    }
}