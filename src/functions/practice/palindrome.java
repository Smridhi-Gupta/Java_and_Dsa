package functions.practice;
public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int num) {
        int sum = 0;
        int temp = num % 10;
        sum = (sum * 10) + temp;
        num = num / 10;
        return temp == sum;
    }
}
