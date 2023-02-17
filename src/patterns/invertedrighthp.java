package patterns;

public class invertedrighthp {
    public static void main(String[] args) {
//        //outer loop
//        for (int i = 1; i <= 4; i++) {
//        //inner loop -> space
//            for (int j = 1; j <= 4-i ; j++) {
//                System.out.print(" ");
//            }
//
//        //inner loop -> star
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 4; i >= 1 ; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 4-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
