package College;
public class Arrays {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(java.util.Arrays.toString(insert(arr.length, arr, 60,3)));
    }

    public static int[] insert(int n, int arr[], int x, int pos) {
        int i;
        int newarr[] = new int[n+1];

        for (i = 0; i < n+1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i-1];
        }
        return newarr;
    }

    public static int[] delete(int n, int arr[], int pos) {
        int positionToDelete = 2;
    }
    int[] arr = {1, 2, 3, 4, 5};
    int positionToDelete = 2; // Change this to the position you want to delete

    int[] newArr = new int[arr.length - 1];
    int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
        if (i != positionToDelete) {
            newArr[newIndex] = arr[i];
            newIndex++;
        }
    }
    arr = newArr;


        System.out.print("Updated Array: ");
        for (int num : arr) {
        System.out.print(num +"");
        }
}