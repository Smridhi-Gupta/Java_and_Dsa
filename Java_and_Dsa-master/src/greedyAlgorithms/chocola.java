package greedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class chocola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4}; // m - 1
        Integer costHor[] = {4, 1, 2}; // n - 1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
    }
}
