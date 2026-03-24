//Count how many times a number appears.
// Input:[2,9,6,8,92,12,9,23,9,4,9,3,9], key = 9
// Output: 3
package ARRAY;
public class Array12{
    public static int linearSearch(int[] a, int key) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int[] a = {2,9,6,8,92,12,9,23,9,4,9,3,9};
        int key = 9;
        int count = linearSearch(a, key);
       System.out.println("key "+  count + " times appear");

    }
}
