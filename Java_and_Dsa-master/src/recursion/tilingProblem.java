package recursion;

public class tilingProblem {
    public static int tilingProb(int n) {
        // 2 * n floor size
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int fnm1 = tilingProb(n - 1);
        // horizontal choice
        int fnm2 = tilingProb(n - 2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProb(3));
    }
}