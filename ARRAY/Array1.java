package ARRAY;//Find the maximum and minimum number in an array of integers
import java.util.*;
public class Array1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("size is = ");
        int size = sc.nextInt();
        int[] number = new int[size];
        for (int i = 0; i<number.length; i++){
            System.out.print("number "+(i+1) +" is = ");
            number[i] = sc.nextInt();
        }
//        System.out.print("max is = ");
//        int max = sc.nextInt();
//        System.out.print("min is = ");
//        int min = sc.nextInt();
//        Integer.MIN_VALUE - means very very small number, Integer.MAX_VALUE - means very very large value,
//        int max = Integer.MIN_VALUE; here min value because we starting it from min to compare with max
//        int min = Integer.MAX_VALUE; here max value because we starting it from min to compare with min
        int max = number[0];
        int min = number[0];

        for (int i = 0; i<number.length; i++){
            if (number[i] > max){
                max = number[i];
            }
            if (number[i] <min){
                min = number[i];
            }
        }
        System.out.println("largest number is " +max);
        System.out.println("smallest number is " +min);
    }
}