package arrays.practice;
public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(Duplicates(arr));
    }
    public static boolean Duplicates(int[] arr) {
        for (int i = 0; i <= arr.length ; i++) {
            for (int j = i+1; j <= arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}