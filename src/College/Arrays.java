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

}