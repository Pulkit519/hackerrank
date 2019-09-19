package book;

public class Book {
    private String bname;
    private String isbn;
    private String baname;

    public String getBname(){
        return bname;
    }
    public String getBaname(){
        return baname;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBaname(String baname) {
        this.baname = baname;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
