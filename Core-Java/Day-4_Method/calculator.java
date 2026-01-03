//Menu-Based Calculator program
import java.util.Scanner;
public class calculator{
    public static int add(int x, int y){
        return x+y;
    }
    public static int subtract(int x, int y){
        return x-y;
    }
    public static int mult(int x, int y){
        return x*y;
    }
    public static int div(int x, int y){
        return x/y;
    }
    public static void main(String[] args){
        int option = -1;
        while(option!=5){
        System.out.println("Choose an the operation you want to perform:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        switch(option){
            case 1 : {
                System.out.print("Enter two numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("Result: "+ add(x,y));
                break;
            }
            case 2 :{
                System.out.print("Enter two numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("Result: "+ subtract(x,y));
                break;
            }
            case 3 :{
                System.out.print("Enter two numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("Result: "+ mult(x,y));
                break;
            }
            case 4 :{
                System.out.print("Enter two numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("Result: "+ div(x,y));
                break;
            }
            case 5 :{
                System.out.println("Exiting...");
                break;
            }
            default : System.out.println("Entered invalid value");
                break;
        }

        }
    }
}