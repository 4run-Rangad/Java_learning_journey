import java.util.Scanner;
class BankAccount{
    private int accNo = -1;
    private String bankname;
    private int balance = 0;
    BankAccount(){
    }
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
    public void setaccNo(int n){
        accNo = n;
    }
    public void setbankname(String str){
        bankname = str;
    }
}

public class main{
    public static void main(String[] a){
        
        int option = -1;
        BankAccount b1 = new BankAccount();      
        while(option!=5){
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
            switch(option){
                case 1:{
                    System.out.println("Enter Account Number: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Bank Name: ");
                    String str = sc.nextLine();
                    b1.setaccNo(n);
                    b1.setbankname(str);
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