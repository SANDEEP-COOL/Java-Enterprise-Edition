
public class Book {
    
    public int getBookid() {
        return bookid;
    }
    public Book(int bookid, String bookname, int price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.price = price;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    private int bookid;
    private String bookname;
    private int price;

}
