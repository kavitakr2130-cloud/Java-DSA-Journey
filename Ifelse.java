
// 1) Check if number is positive, negative, or zero.
// public class ifelse {
//     public static void main (String[] args){
//         int num = -6;
//     if (num > 0){
//         System.out.println("positive");
//     }else if (num < 0)  {
//         System.out.println("negative");
//     } else  {
//         System.out.println("zero");
//     }
//     }
// }

// 2) Find largest of two numbers.
// public class ifelse {
//     public static void main (String[] args){
//         int num1 = 156;
//         int num2 = 789;
//     if (num1> num2){
//         System.out.println("largest number is:" + num1);
//     }else  {
//         System.out.println("largest number is:" + num2);
//     }
//     }
// }

// 3) Find largest of three numbers.
// public class Ifelse {
//     public static void main (String[] args){
//         int num1 = 67567;
//         int num2 = 67567;
//         int num3 = 3458;
//         // > -> means strictly greater. >= means greater or equal (koi bhi ek)
//     if (num1 >= num2 && num1 >= num3){
//         System.out.println("Largest number is :" + num1);
//     }else if (num2 >= num1 && num2 >= num3)  {
//        System.out.println("Largest number is :" + num2);
//     } else  {
//         System.out.println("Largest number is :" + num3);
//     }
//  }
// }

// # Level 2 (Important)

// 1)Check if a year is leap year
// public class Ifelse {
//     public static void main(String[] args){
//         int year = 2400;
//         if (year % 400 == 0) {
//             System.out.println("It's a leap year");
//         }else if (year % 100 == 0) {
//             System.out.println("Not a leap year:");
//         }else if (year % 4 == 0) {
//             System.out.println("It's a leap year");
//         }else{
//             System.out.println("Not a leap year:"); 
//         }

//     }
// }

// 2) Check if a character is vowel or consonant.
// public class Ifelse {
//     public static void main(String[] args) {
//         char ch = 'Z';
//         ch = Character.toLowerCase(ch);
//         if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
//            System.out.println("It is vowel");  
//         }else{
//             System.out.println("It is consonant");  
//         }
//     }
// }

// 3) Check if number is divisible by 3 and 5.
// public class Ifelse{
//     public static void main(String[] args) {
//         int n = 60;
//         if (n%3 == 0 && n%5 == 0) {
//             System.out.println("Divisible");
//         }else{
//             System.out.println("Not divisible");
//         }      
//     }
// }

// Level 3 (Placement Favorite)

// 1) Grade system (90+, 80+, 70+, etc.)
// public class Ifelse{
//     public static void main(String[] args) {
//         int number = 87;
//         if (number >= 90) {
//             System.out.println("Marks:" + number + " _Grade A");
//         }else if (number >= 80) {
//             System.out.println("Marks:" + number + " _Grade B");
//         }else if (number >= 70) {
//             System.out.println("Marks:" + number + " _Grade C");    
//         }else {
//             System.out.println("Marks:" + number + " _Grade D");
//         }
//     }
// }

// 2) Check if a number is prime
// public class Ifelse{
//     public static void main(String[] args){


//     }
// }

// 3) Simple calculator using if–else (+, −, ×, ÷)
// import java.util.Scanner;

// public class Ifelse {
//      public static void main(String[] args){

//         Scanner sc =  new Scanner(System.in);

//            System.out.print("Enter first number:");
//             int a = sc.nextInt();
    
//            System.out.print("Enter first number:");
//             int b = sc.nextInt();

//            System.out.print("Enter operator2:");
//             char op = sc.next().charAt(0);
         
//          if(op =='+') {
//             System.out.println("Result:" + (a+b));
//         }else if (op=='-'){
//             System.out.println("Result:" + (a-b));
//         }else if (op=='*'){
//             System.out.println("Result:" + (a*b));
//         }else if (op=='/'){
//             if (b!=0){
//              System.out.println("Result:" + (a/b));   
//             }else{
//               System.out.println("cannot divisible by zero");
//             }       
//         }else{
//             System.out.println("invalid operator");
//         }sc.close();
//   }

// }

