//Take array from user and:
//Check if element exists
//Print index (first occurrence)
//Count total occurrences
package ARRAY;
import java.util.Scanner;
public class Array14 {
    public static int firstIndex(int[] a, int key) {
        for (int i = 0; i<a.length; i++) {
            if (a[i] == key) {
               return i;
            }
        }
        return -1;
    }
    public static int countOccurence(int[] a, int key) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter" + (i + 1) + ":");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter key: ");
        int key = sc.nextInt();

        int index = (firstIndex(a, key));
        int count = (countOccurence(a, key));
        if (index == -1) {
            System.out.println("Element not found ");
        } else{
            System.out.println("Element found at index: "+index );
            System.out.println("Element appears " +count+ " times" );
        }
    }
}