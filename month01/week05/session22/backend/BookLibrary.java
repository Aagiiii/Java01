import java.io.StringReader;

class Book{
 boolean   isAvailable = true;
    String title;
    String author;
    int pages;
    double prices;

    Book(String title, String author, int pages, double prices){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.prices = prices;
    }

    void displayInfo(){
        if (isAvailable) {
            System.out.println( title +" is on stock");
    }else{
            System.out.println( title +" is out of stock");
    }
        } 
        
        

    void borrow(){
        isAvailable= false;
        System.out.println(title + " is borrowed");
    }

    void returnBook(){
        isAvailable =true;
        System.out.println(title + " is returned");
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("Java basics", null, 0, 0);
        Book b2 = new Book("Python Guide", null, 0, 0);
        Book b3 = new Book("C++ Tutorial", null, 0, 0);
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
        System.out.println();
        b1.borrow();
        b1.displayInfo();
        b1.returnBook();
    }
}
