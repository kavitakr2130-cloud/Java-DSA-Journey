// copy an array.
package ARRAY;
public class Array22 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 9};
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(copy[i]+" ");
        }
    }
}