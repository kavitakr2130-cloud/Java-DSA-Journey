package ARRAY;//take 5 number from user and print it
import java.util.*;
public class Array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
//        array syntax
//        type[] arrayName = new type[size]
        int[] number = new int[size];
        for (int i =0; i<number.length; i++){
            number[i] = sc.nextInt();
        }
        for (int i =0; i<number.length; i++){
            System.out.println(number[i]);
        }

    }
}