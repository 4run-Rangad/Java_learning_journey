class BankAccount{
    private int accNo;
    private double balance;
    public double deposit(double a){
        balance += a;
        return balance;
    }
    public double withdraw(double a){
        balance -= a;
        return balance;
    }
    public double setBalance(double a){
        balance = a;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
}
public class encap{
    public static void main(String[] a){
        BankAccount obj = new BankAccount();
        System.out.println(obj.setBalance(1500.0));
        System.out.println(obj.deposit(38));
        System.out.println(obj.getBalance());

    }
}