// check is array is sorted in descending order.
package ARRAY;
import java.util.*;
public class Array20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter array ["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        boolean sorted = true;
        for (int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                sorted=false;
                break;
            }
        }
        if(sorted)
        {
            System.out.println("array is sorted");
        }else
        {
            System.out.println("array is not sorted");
        }

    }
}