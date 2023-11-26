package College;
public class Arrays {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(java.util.Arrays.toString(insert(arr.length, arr, 60,3)));
        System.out.println(java.util.Arrays.toString(delete(arr, 2)));
        System.out.println(java.util.Arrays.toString(update(arr, 35, 2)));
        System.out.println(java.util.Arrays.toString(reverse(arr)));
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

    public static int[] delete(int arr[], int pos) {
        int[] newarr = new int[arr.length-1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pos) {
                newarr[newIndex] = arr[i];
                newIndex++;
            }
        }
        arr = newarr;
        return newarr;
    }

    public static int[] update(int arr[], int x, int pos) {
        for (int i = 0; i < arr.length; i++) {
            if(i == pos) {
                arr[i] = x;
            }
        }
        return arr;
    }

    public static int[] reverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int first = 0, last = arr.length-1;
            while (first < last) {
                int temp = arr[last];
                arr[last] = arr[first];
                arr[first] = temp;
                first++;
                last--;
            }
        }
        return arr;
    }
}