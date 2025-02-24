package greedyAlgorithms;

public class subarraySum {
    public static int ans = 10000000;
    public static void solve(int a[], int n, int k, int index, int sum, int maxSum) {

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 3;
        int n = 4;
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans+"\n");
    }
}
