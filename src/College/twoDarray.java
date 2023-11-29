package College;

import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = sc.nextInt();
        System.out.println("enter number of col");
        int col = sc.nextInt();
        int[][] n = new int[row][col];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.println("enter "+i + " of "+ j + "th element");
                n[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}
