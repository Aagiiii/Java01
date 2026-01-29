
public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println("Is 7 prime? " + isPrime(7));    // true
        System.out.println("Is 10 prime? " + isPrime(10));  // false
        System.out.println("Is 17 prime? " + isPrime(17)); 
    }
    public static boolean isPrime(int m){
        if (m<=1) {
            return false;
            
        }
        if (m==2) {
            return true;
        }
        if (m%2==0) {
            return false;
        }
        for (int i = 3; i*i <=m; i+=2) {
            if (m%i==0) {
                return false;
            }
        }
        return true;
    }
}
