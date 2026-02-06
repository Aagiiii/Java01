class ProductP{
    String name;
    double price;
    int quantity;
    ProductP(String name, double price, int quantity){
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
        System.out.println();
    }
    // public void setDiscount(int i) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setDiscount'");
    // }
    // public void display() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'display'");
    // }

    

}

public class ProductPractice {
    public static void main(String[] args) {
        ProductP p1 = new ProductP("Laptop",2500000,1);
        ProductP p2 = new ProductP("Mouse", 45000, 3);
        ProductP p3 = new ProductP("Keyboard", 85000, 2);
       double grandTotal =0;

        ProductP[] products = new ProductP[3];
        products[0] =p1;
        products[1] =p2;
        products[2] =p3;

        for (int i = 0; i < products.length; i++) {
            System.out.println("=== Product " + (i+1) + " ====");
            products[i].displayInfo();
            grandTotal += products[i].calculateTotal();

        }

    //    System.out.println("=== Product 1===");
    //    p1.displayInfo();
    //    grandTotal += p1.calculateTotal();

    //    System.out.println("=== Product 2===");
    //    p2.displayInfo();
    //    grandTotal += p2.calculateTotal();

    //    System.out.println("=== Product 3===");
    //    p3.displayInfo();
    //    grandTotal += p3.calculateTotal();

       System.out.println("------------------------");
       System.out.println("Grand Total: " + grandTotal);
}
}