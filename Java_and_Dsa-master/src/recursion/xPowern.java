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
        int halfPower = optimisedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        int a = 2;
        int n = 10;
        System.out.println(optimisedPower(a, n));
    }
}