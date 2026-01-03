public class fatorial{
    public static int fact(int n){
        int x = 1;
        for(int i = 1;i<=n;i++){
            x*=i;
        }
        return x;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.print("Factorial for n is: "+fact(n));
    }
}