package recursion;

public class printIncNum {
    public static void printIncNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncNum(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printIncNum(n);
    }
}
