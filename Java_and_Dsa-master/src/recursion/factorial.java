package recursion;

public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            System.out.print(n);
            return 1;
        }
        System.out.println(n + " ");
        int fnm1 = fact(n - 1);
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        fact(n);
    }
}
