package ARRAY;//take an array and a number x . count how many times x appears in the array.
import java.util.*;
public class Array6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size  = ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("array "+(i+1) +" is = ");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the x = ");
        int x = sc.nextInt();
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                count++;
            }
        } System.out.print("x appears "+count+" times");
    }

}