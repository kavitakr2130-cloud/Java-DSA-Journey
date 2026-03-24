package ARRAY;// Take an array of name as input from the user and print them on the screen.
import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
//        array syntax
//        type[] arrayName = new type[size]
       String[] name = new String[size];
       for (int i =0; i<name.length; i++){
          name[i] = sc.next();
       }
       for (int i =0; i<name.length; i++){
           System.out.println(name[i]);
       }

    }
}