package recursion;

public class xPowern {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimisedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimisedPower(a, n/2);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
