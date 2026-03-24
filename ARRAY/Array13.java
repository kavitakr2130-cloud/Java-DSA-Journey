//Print all indices where the element is found.
//Input:[5, 1, 5, 3, 5], key = 5
//Output: 0 2 4
package ARRAY;
public class Array13 {
    public static void main(String[] args) {
        int[] a = {13,1,13,13,8,9,15,6,};
        int key = 13;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.print(i+ " ");
            }

        }
    }
}
