import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
        System.out.print("Enter the fibonacci terms you need: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        int sum = 0;
        System.out.print(a+" "+b+" ");
        for(int i = 0; i<n-2; i++){
            sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
    }
}