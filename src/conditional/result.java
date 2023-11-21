package conditional;
import java.util.*;
public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        System.out.println("enter your marks");
        String reportCard = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(reportCard);
    }
}
