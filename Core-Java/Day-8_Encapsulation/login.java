class User{
    private String username = " Arun";
    private String password = "ArunJava123";
    public void login(String username, String password){
        if(this.username == username && this.password == password){
            System.out.println("Welcome, "+ username);
        }
        else System.out.println("Invalid login Credentials!");
    }
    public void changePassword(String password){
        this.password = password;
    }
}
public class login{
    public static void main(String[] a){
        User u = new User();
        u.login("Raj", "123");
    }
}