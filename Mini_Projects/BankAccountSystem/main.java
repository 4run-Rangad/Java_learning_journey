import java.util.Scanner;
import java.util.ArrayList;
class BankAccount{
    private int accNo;
    private String bankname;
    private int balance = 0;
    BankAccount(int accNo, String bankname){
        this.accNo = accNo;
        this.bankname = bankname;
    }
    public void setaccNo(int n){
        accNo = n;
    }
    public void setbankname(String str){
        bankname = str;
    }
    public int getAccNo(){
        return accNo;
    }
    public String getName(){
        return bankname;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int amount){
        balance = amount;
    }
    public String toString(){
        return bankname+ " :("+accNo+") ";
    }
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String str){
        super(str);
    }
}
class BankService{
    int bal;
    ArrayList<BankAccount> accounts = new ArrayList<>();

    //Account Creation
    public void createAccount(int n , String str){
        BankAccount b = new BankAccount(n , str);
        accounts.add(b);
    }

    //Deposit
    public void deposit(int accNo , int amount){
        for(BankAccount b : accounts){
            if(b.getAccNo()==accNo){
                b.setBalance(b.getBalance()+amount);
                System.out.println("Successfully deposited.");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    //Withdrawal
    public void withdraw(int accNo,int amount){
        for(BankAccount b : accounts){
            if(b.getAccNo()==accNo){
                try{
                    if(b.getBalance()<amount) throw new InsufficientBalanceException("You do not have enough balance to make this withdrawal!");
                    else{
                        b.setBalance(b.getBalance()-amount);
                        System.out.println("Successfull Withdrawal.");
                        return;
                    }
                }
                catch(InsufficientBalanceException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Account not found!");
    }

    //Check Balance
    public void checkBalance(int accNo){
        for(BankAccount b : accounts){
            if(b.getAccNo()==accNo){
                System.out.println("Total Balance in your account: "+ b.getBalance()+" rupees");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    //Display Account Info
    public void display(int accNo){
        for(BankAccount b : accounts){
            if(b.getAccNo()==accNo){
                System.out.println("Account No.: " + b.getAccNo());
                System.out.println("Account name: "+ b.getName());
                return;
            }
        }
        System.out.println("Account not found!");
    }

}
public class main{
    public static void main(String[] a){
        
        int option = -1;

        BankService b1 = new BankService();      

        while(option!=6){
        System.out.println("BANK ACCOUNT SYSTEM ");
        System.out.println("***********************");
        System.out.println("How can I help you today....");
        System.out.println("1.Create Account");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Check Balance");
        System.out.println("5.Display Account Details");
        System.out.println("6.Exit");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
            switch(option){
                case 1:{
                    System.out.println("Enter Account Number: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Bank Name: ");
                    String str = sc.nextLine();
                    b1.createAccount(n , str);
                    break;
                }
                case 2:{
                    System.out.println("Enter the Account Number: ");
                    int accNo = sc.nextInt();
                    System.out.println("Enter the amount you would like to deposit.");
                    int amount = sc.nextInt();
                    b1.deposit(accNo,amount);
                    break;
                }
                case 3:{
                    System.out.println("Enter the Account Number: ");
                    int accNo = sc.nextInt();
                    System.out.println("Enter the amount you would like to withdraw.");
                    int amount = sc.nextInt();
                    b1.withdraw(accNo,amount);
                    break;
                }
                case 4:{
                    System.out.println("Enter the Account Number: ");
                    int accNo = sc.nextInt();
                    b1.checkBalance(accNo);
                    break;
                }
                case 5:{
                    System.out.println("Enter the Account Number: ");
                    int accNo = sc.nextInt();
                    b1.display(accNo);
                    break;
                }
                case 6:{
                    System.out.println("Thank You..");
                    break;
                }
            }
        }

    }
}