package ARRAY;//Take an array of 6 number and a number x from the user. checks if x exists in the array or not
import java.util.*;
public class Array3{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array = ");
     int size = sc.nextInt();
     int[] number = new int[size];
     for (int i =0; i<number.length; i++){
         System.out.print("number "+(i+1) +" is = ");
         number[i] = sc.nextInt();
     }
     System.out.println("Enter the num = ");
     int num = sc.nextInt();

//     I am assuming the number is NOT found yet.
     boolean found = false;

     for(int i = 0;i<number.length;i++){
         if(num == number[i]){
//           Okay Now I FOUND it → change to true
             found = true;
             break;
         }

     }
        if(found){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

    }
}