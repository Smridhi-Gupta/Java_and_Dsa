package loops.practice;
public class evenOddSum {
    public static void main(String[] args) {
        int evensum = 0, oddsum = 0;

        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                evensum = evensum + i;
            }
            else {
                oddsum = oddsum + i;
            }
        }
        System.out.println("sum of even numbers :" +evensum);
        System.out.println("sum of odd numbers :" +oddsum);
    }
}
