package College;

public class insertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { //start from index 1 to divide array in sorted and unsorted part
            // 0th index is a sorted part nd rest is unsorted
            int temp = arr[i]; //storing 1st index element as temp
            int prev = i - 1; // storing 0th index

            //finding out the correct position to insert
            while (prev >= 0 && arr[prev] > temp) { //comparing 0th element with 1st element weather it is
                // small or greater if previous element is > temp then shift the 1st element to the right
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = temp;
        }
    }

    public static void printArr(String msg, int[] arr) {
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        printArr("Before", arr);
        insertionSort(arr);
        printArr("After", arr);
    }
}
