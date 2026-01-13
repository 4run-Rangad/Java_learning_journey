import java.util.Scanner;
class BankAccount{
    private int accNo = -1;
    private String bankname;
    private int balance = 0;
    BankAccount(int accNo, String bankname){
        this.accNo = accNo;
        this.bankname = bankname;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        if(balance<amount) System.out.println("Insufficient Balance!");
        else balance-=amount;
    }
    public void checkBalance(){
        System.out.println("Total Balance in your account: "+ balance+" rupees");
    }
}

public class main{
    public static void main(String[] a){
        
        int option = -1;
        System.out.println("BANK ACCOUNT SYSTEM ");
        System.out.println("***********************");
        System.out.println("How can I help you today....");
        System.out.println("1.Create Account");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Check Balance");
        System.out.println("5.Exit");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        while(option!=5){
            switch(option){
                case 1:{
                    System.out.println("Enter Account Number: ");
                    int n = sc.nextInt();
                    System.out.println("Enter Bank Name: ");
                    String str = sc.nextString();
                    BankAccount b1 = new BankAccount(n,str);
                    break;
                }
                case 2:{
                    System.out.println("Enter the amount you would like to deposit.");
                    int amount = sc.nextInt();
                    b1.deposit(amount);
                    System.out.println("Successfuly deposited.");
                    break;
                }
                case 3:{
                    System.out.println("Enter the amount you would like to withdraw.");
                    int amount = sc.nextInt();
                    b1.withdraw(amount);
                    System.out.println("Successfull Withdrawal.");
                    break;
                }
                case 4:{
                    b1.checkBalance();
                    break;
                }
                case 5:{
                    break;
                }
            }
        }

    }
}