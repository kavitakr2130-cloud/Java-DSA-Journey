import java.util.*;
public class Function8{
   public static void printEligibility(int age){
       if (age<18){
           System.out.println("Person is not eligible for vote");
       }else{
           System.out.println("Person is eligible for vote");
       }
   }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter age = ");
       int age = sc.nextInt();
       printEligibility(age);
   }
}