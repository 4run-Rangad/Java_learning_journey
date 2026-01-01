import java.util.Scanner;

class check{
    void chkprime(int n){
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
    void evenOdd(int n){
        if((n%2)==0){
            System.out.println(n + " is Even");
        }
        else System.out.println(n + " is Odd");
    }
}
public class forloop{
    public static void main(String[] args){
        System.out.println("Enter a number to check: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check p = new check();
        p.chkprime(n);
        p.evenOdd(n);
        for(int i = 1;i<=100;i++){
            System.out.print(i + " ");
        }
    }
}