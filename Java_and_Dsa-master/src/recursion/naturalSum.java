package recursion;

public class naturalSum {
    public static int calcSum(int n) {
        if (n == 1) {
            System.out.print(n);
            return 1;
        }
        System.out.print(n);
        int snm1 = calcSum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static void main(String[] args) {
        int n = 10;
        calcSum(n);
    }
}
