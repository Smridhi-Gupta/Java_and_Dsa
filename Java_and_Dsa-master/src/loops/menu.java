package loops;
import java.util.*;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        int marks = sc.nextInt();

        if (button == 1) {
            if (marks >= 90) {
                System.out.println("this is good");
            }
        }
    }
}
