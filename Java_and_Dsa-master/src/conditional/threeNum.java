package conditional;

public class threeNum {
    public static void main(String[] args) {
        int a =100 , b = 20 , c = 4;
        if ((a >= b) && (a>= c)) {
            System.out.println("largest is a");
        }
        else if (b >= c ){
            System.out.println("largest is b");
        }
        else {
            System.out.println("largest is c");
        }
    }
}
