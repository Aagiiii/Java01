class Product{
    String name;
    double price;
    int quantity;
    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // double total = price*quantity;
    double calculateTotal(){
        return price*quantity;
    }
    void displayInfo(){
        // System.out.println("===Product 1 ===");
        System.out.println(name  + "-" + price + "x" + quantity +"="+ calculateTotal());
    }

    

}

public class ProductPractice {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop",2500000,1);
        Product p2 = new Product("Mouse", 45000, 3);
        Product p3 = new Product("Keyboard", 85000, 2);
       double grandTotal =0;

       System.out.println("=== Product 1===");
       p1.displayInfo();
       grandTotal += p1.calculateTotal();

       System.out.println("=== Product 2===");
       p2.displayInfo();
       grandTotal += p2.calculateTotal();

       System.out.println("=== Product 3===");
       p3.displayInfo();
       grandTotal += p3.calculateTotal();

       System.out.println("------------------------");
       System.out.println("Grand Total: " + grandTotal);
}
}