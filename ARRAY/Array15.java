// reverse array
package ARRAY;

public class Array15{
    public static void reverse(int[] arr, int i, int j) {
       while(i<j){
           swap(arr,i,j);
           i++;
           j--;
       }

    }
        public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverse(arr,0,arr.length-1);
       for(int x : arr){
           System.out.print(x+" ");
       }
    }
    
}