
public class PrimeNumbers {
    
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int count = 0;
        
        int num = 2;
 
        while (count < 10) {
            
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}