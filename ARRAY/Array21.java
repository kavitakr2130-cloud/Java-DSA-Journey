//sum and average of an array.
package ARRAY;
import java.util.Scanner;
public class Array21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("enter the " + (i + 1) + " element = ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
//        Convert before divide, not after . anyone operand is double the result automatically will show in double .
        double average =  (double) sum / n ;
        System.out.println("sum : "+sum);

        System.out.println("average : "+average);
    }

    }

