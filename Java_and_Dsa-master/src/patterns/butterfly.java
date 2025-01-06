package patterns;

public class butterfly {
    public static void main(String[] args) {
        //upper half
        //4 lines
        for (int i = 1; i <= 4 ; i++) {
            //left stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            //middle space
            for (int j = 1; j <= 2*(4-i) ; j++) {
                System.out.print(" ");
            }
            //right stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        //4 lines
        for (int i = 4; i >= 1 ; i--) {
            //left stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            //middle space
            for (int j = 1; j <= 2*(4-i) ; j++) {
                System.out.print(" ");
            }
            //right stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
