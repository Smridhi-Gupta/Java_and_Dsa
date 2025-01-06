package functions;
import java.util.*;
public class primeNotPrime {
    //only for n>=2
    public static boolean isPrime(int n) {
        //corner case
        //2
       if(n == 2) {
           return true;
       }
        boolean isPrime = true; //already prime
        for (int i = 2; i <= n-1 ; i++) {
            if (n % i == 0) { //completely dividing
                isPrime = false; //not prime
                break; //return isPrime  / return false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {

        System.out.println(isPrime(2));
    }
}