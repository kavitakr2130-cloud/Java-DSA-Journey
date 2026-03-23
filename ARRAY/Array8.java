package ARRAY;
public class Array8 {
    public static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {50, 42, 79, 86};
        int key = 50;
       System.out.println(linearSearch(a, key));
    }
}