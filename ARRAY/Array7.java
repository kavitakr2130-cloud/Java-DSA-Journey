package ARRAY;//take an array and a number x . count how many times x appears in the array.

public class Array7 {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 7};
        int max = array[0];
        for (int i = 0; i < 5; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        } System.out.println("Largest element is "+max);
    }
}
