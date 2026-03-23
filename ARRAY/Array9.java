package ARRAY;

import java.util.Arrays;
import java.util.List;

public class Array9 {
    public static int binarySearch(int[] a, int key) {
        int l = 0, h = a.length - 1, mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key > a[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
//        unsorted array
//        int[] a = {50, 42, 67,79, 86,93,65,17,28,39,};
//        Arrays.sort(a);

//        sorted array
        int[] a = {2, 42, 67,79, 86,93};
        int key = 67;
        System.out.println(binarySearch(a, key));
    }


}