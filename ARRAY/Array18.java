// smallest and secondsmallest in an array.
package ARRAY;

import java.util.*;
public class Array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("arr [ " + (i + 1) + " ] is = ");
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }


        }
        if (secondsmallest == Integer.MAX_VALUE) {
            System.out.println("not found any secondsmallest");
        } else {
            System.out.println("smallest = "+smallest);
            System.out.println("secondSmallest = " + secondsmallest);
        }
    }
}