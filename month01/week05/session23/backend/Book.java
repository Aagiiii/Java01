

public class Book {
     // TODO: private талбарууд зарлах
    // - title (String)
    private String title;
    // - author (String)
     private String author;
    // - pages (int)
    private int pages;
    // - price (double)
    private double price;


    // TODO: Getter методууд
    // - getTitle()
    public String getTitle(){
        return title;
    }
    // - getAuthor()
     public String getAuthor(){
        return author;
    }
    // - getPages()
     public int getPages(){
        return pages;
    }
    // - getPrice()
     public double getPrice(){
        return price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author =author;
    }

    public void setPages(int pages){
        this.pages =pages;
    }

    public void setPrice(double price){
        this.price = price;
    }


    // TODO: Setter методууд
    // - setTitle(String title)
    // - setAuthor(String author)
    // - setPages(int pages)
    // - setPrice(double price)


    // TODO: getReadingTime() - унших хугацаа (pages / 30)

    public double getReadingTime(){
        return pages/30;
    }

    // TODO: applyDiscount(double percent) - хөнгөлөлт хийх
    // Жишээ: 10% хөнгөлөлт бол price = price - (price * 10 / 100)
     public double applyDiscount(int discount){
        return price = price - (price*discount/100);
     }

    // TODO: displayInfo() - мэдээлэл хэвлэх
    public void displayInfo(){
        System.out.println("=== Info of Books ===");
        System.out.println("Title is " + getTitle());
        System.out.println("Author is " + getAuthor());
        System.out.println("Pages: " + getPages());
        System.out.println("Price is: "+ getPrice());
        System.out.println(getReadingTime() + "days");

        System.out.println("After discount by ");
        System.out.println("New price is: " + applyDiscount(10));
    }
}
