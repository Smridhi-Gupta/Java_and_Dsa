package functions.practice;
public class evenOdd {
    public static void main(String[] args) {
        System.out.println(Even(11));
    }
    public static boolean Even(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
