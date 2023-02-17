package loops;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println("no is prime");
        }
        else {
            System.out.println("no is not prime");
        }
    }
}
