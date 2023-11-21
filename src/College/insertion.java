package College;

import java.util.Arrays;
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Original Array: " + Arrays.toString(array));

        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();

        if (position >= 1 && position <= array.length + 1) {
            int[] newArray = new int[array.length + 1];

            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position - 1) {
                    newArray[i] = elementToInsert;
                } else {
                    newArray[i] = array[j++];
                }
            }

            array = newArray;

            System.out.println("Updated Array: " + Arrays.toString(array));
        } else {
            System.out.println("Invalid position. Position should be between 1 and " + (array.length + 1));
        }
    }
}
