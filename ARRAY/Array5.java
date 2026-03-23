package ARRAY;//Take an array of 6 number and a number x from the user.
// checks if x exists in the array or not and where it exists
import java.util.*;
public class Array5{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array = ");
        int size = sc.nextInt();
        int[] number = new int[size];
        for (int i =0; i<number.length; i++){
            System.out.print("number "+(i+1) +" is = ");
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the num = ");
        int x = sc.nextInt();

        for(int i = 0;i<number.length;i++){
            if(x == number[i]){
                System.out.println("x is Found at " + i);
                return;
            }
        } System.out.println("Not Found");

    }
}