// check if array is sorted in ascending order.
package ARRAY;
import java.util.*;



public class Array19{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[]  arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the array["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        boolean sorted =true ;
        for(int i=0;i<size-1;i++) {
//            here size - 1 because arr[0] and arr[1] for comparison but at the last arr[9] and arr[10] will be wrong because 10 is the size
//            of an array not the last value,last value is 9.
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted){
                System.out.println("Array is  sorted");
            } else {
            System.out.println("Array is not sorted");
        }
    }
}