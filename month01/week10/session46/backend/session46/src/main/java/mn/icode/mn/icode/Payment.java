package mn.icode;

public class Payment {
    public static void main(String[] args) {
        Qpay q1 = new Qpay();
        q1.processPayment(5000);

        Socialpay s1 = new Socialpay();
        s1.processPayment(3000);
    }
}

interface PaymentMethod {
void processPayment(double amount);
    
}

class Qpay implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing " + amount + "$ via QPay QR code.");
    }
}

class Socialpay implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Swiping Social Pay for " + amount + "$.");
    }
}