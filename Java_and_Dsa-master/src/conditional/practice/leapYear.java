package conditional.practice;

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (year%4 == 0 && year%400 == 0 || year%100 != 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
