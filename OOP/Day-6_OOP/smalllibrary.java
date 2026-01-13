class Book{
    String title = "";
    String auth = "";
    int price = 0;
    Book(String title, String auth, int price){
        this.title = title;
        this.auth = auth;
        this.price = price;
    }
    public void details(){
        System.out.println("Title of Book: " + title);
        System.out.println("Author's name: " + auth);
        System.out.println("Price: " + price);
    }
}
public class smalllibrary{
    public static void main(String[] a){
        Book b1 = new Book("Mathematics", "R.D.Sharma", 800);
        b1.details();
    }
}