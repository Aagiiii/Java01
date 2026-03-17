package mn.icode;

public class Book {
    public static void main(String[] args) {
        
    }
}

class Bookm implements Printable {
    private String title;
    private String author;
    private int pages;

    // TODO: constructor үүсгэнэ үү

    public Bookm( String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void print() {
        // TODO: энд кодоо бичнэ үү
        System.out.println("Title of book is " + title);
    }

    @Override
    public String getInfo() {
        // TODO: энд кодоо бичнэ үү
        return "author";
    }
}

interface Printable {

   void print();

   String getInfo();
    
}