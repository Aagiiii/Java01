public class Product{
    // TODO: private fields
    private String name;
    private double price;
    private int quantity;
    private double discountPercent;

    // TODO: Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // TODO: Getters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // TODO: setDiscount(double percent) - 0-100

    public void setDiscount(double percent) {
        this.discountPercent = percent;
    }

    // TODO: getDiscountedPrice()
    public double getDiscountedPrice() {
        return price- (price * discountPercent / 100);
    }

    // TODO: getTotalPrice()
public double getTotalPrice(){
    return getDiscountedPrice()*quantity;
}

    // TODO: addStock(int amount)
public void addStock(int amount){
    quantity+=amount;
    System.out.println("Stock is increased by " + amount);
}
    // TODO: removeStock(int amount) - boolean
    public boolean removeStock(int amount){
        if (quantity >= amount) {
            quantity-=amount;
            System.out.println("Stock is decreased by  " + amount);
            return true;
        } else{
            System.out.println("Out of Stock");
            return false;
        }
    }

    // TODO: display()

    public void display(){
        System.out.println();
        System.out.println("Product: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Discount: " + discountPercent);
        System.out.println("dsicounted: " + getDiscountedPrice());
        System.out.println("Stock: "+ quantity);
        System.out.println("Total price: "+ getTotalPrice());
    }

}
