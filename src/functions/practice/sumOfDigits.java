package functions.practice;
public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(Digitsum(1234));
    }
    public static int Digitsum(int n) {
        int sum =0;
        while (n>0) {
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n = n/ 10;
        }
        return sum;
    }
}
