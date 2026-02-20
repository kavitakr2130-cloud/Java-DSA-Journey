// 1) Print numbers from 1 to 10
//  for loop
// public class loop {
//     public static void main(String[] args){
//         for (int i = 1; i< 11; i ++){
//             System.out.println(i);
//         }
//     }
// }
//  while loop
// public class loop{
    // public static void main(String[] args) {
        // int i = 1;
        // while (i<11){
            // System.out.println(i);
            // i += 1;
        // }

    // }
// }



//  2) Print numbers from 10 to 1
// for loop
//  public class loop {
    // public static void main(String[] args){
        // for (int i = 10; i > 0; i--){
            // System.out.println(i);
        // }
    // }
    // }
// while loop
// public class loop {
//      public static void main(String[] args){
//         int i = 10;
//          while (i>0) {
//              System.out.println(i);
//              i -= 1;
//          }
//      }
//     }


// 3) Print numbers from 1 to N (N = 5)
// for loop
// public class loop {
//     public static void main(String[] args){
//         for (int i = 1; i< 6; i ++){
//             System.out.println(i);
//         }
//     }
// }
// while loop
// public class loop {
//      public static void main(String[] args){
//         int i = 1;
//          while (i < 6) {
//             System.out.println(i);
//             i += 1;
//          }
        
//      }
//  }


//  4) Find sum of numbers from 1 to 10
// for loop
// public class loop {
//     public static void main(String[] args){
//         int sum = 0;
//         for (int i = 1; i< 11; i ++){
//             sum = sum + i;
//         } System.out.println(sum);
//     }
// }
// while loop
// public class loop {
//     public static void main(String[] args){
//         int sum = 0;
//         int i = 1;
//         while ( i < 11) {
//             sum = sum + i;
//             i += 1;
//         }
//          System.out.println(sum);       
//     }   
// }

// 5) Print numbers from 1 to N
// for loop
// public class loop {
//     public static void main(String[]args){
//         int N = 10;
//         for (int i = 1; i <= N; i ++){
//             System.out.println(i);

//         }
//     }
// }
// while loop
// public class loop {
//     public static void main(String[]args){
//         int N = 10;
//         int i = 1;
//         while (i <= N){
//             System.out.println(i);
//             i += 1;

//         }
//     }
// }

// 6) Find sum of first N numbers
// for loop
// public class loop {
//      public static void main(String[]args){
//         int N = 5;
//         int sum = 0;
//         for (int i = 1;i<=N;i++){
//             sum = sum + i;      
//         }
//         System.out.println(sum);
//      }
// }
// while loop
// public class loop {
//      public static void main(String[]args){
//         int N = 5;
//         int sum = 0;
//         int i = 1;
//          while (i<=N){
//             sum = sum + i;
//             i+=1;
//         }
//         System.out.println(sum);  
//      }
// }


// 7) Print even numbers between 1 and 50
// for loop
// public class loop {
//      public static void main(String[]args){
//        for (int i = 1; i <= 50; i ++){
//           if (i % 2 == 0) {
//             System.out.println(i);
//           }
//        }
//      }
// }
// while loop
// public class loop {
//      public static void main(String[]args){
//        int i = 1;
//        while (i <= 50){
//           if (i % 2 == 0) {
//             System.out.println(i);
//           }
//           i += 1;
//        }
//      }
// }


// 8) Print square of numbers from 1 to 5
// for loop
//  public class loop {
//      public static void main(String[] args){
//          for (int i = 1; i<=5; i++) {
//              int square = i*i;  
//           System.out.println(square);      
//          }
//         }
//     }
// while loop
// public class loop {
//     public static void main(String[] args){
//         int i = 1;
//         while (i<=5) {
//         int square = i*i;
//         System.out.println(square);
//         i++;
//         }
//     }
// }

// 9) Print even numbers from 1 to 20
// for loop
// public class loop{
//     public static void main(String[] args){
//         for (int i = 1;i<21;i++){
//             if (i % 2 == 0 ){
//                 System.out.println(i);
//             }
//      }
//     }
// }
// while loop
// public class loop{
//     public static void main(String[] args){
//         int i = 1;
//         while (i<21){
//             if (i % 2 == 0 ){
//                 System.out.println(i);
//             }
//             i += 1;
//      }
//     }
// }


//  10) Print odd numbers from 1 to 20
// for loop
// public class loop {
//     public static void main(String[] args){
//         for (int i = 1;i<21;i++) {
//             if (i % 2!= 0){
//                 System.out.println(i);
//             }

//         }

//     }
// }
// while loop
// public class loop {
//     public static void main(String[] args){
//         int i= 1;
//         while (i<21) {
//             if (i % 2!= 0){
//                 System.out.println(i);
//             }
//             i++;
//         }
//     }
// }


// 11) Count how many even numbers between 1 and 50
//  for loop
// public class loop{
//     public static void main(String[] args){
//         int count = 0;
//         for (int i = 1; i<51; i ++) {
//             if (i % 2 == 0){
//                 count += 1;
                
//             }

// }  System.out.println(count);
//     }
// }
// while loop
// public class loop{
//     public static void main(String[] args) {
//         int i = 1;
//         int count = 0;
//         while(i<51){
//             if (i % 2 == 0){
//                count += 1;
              
//             }
        
//         i++;
//         }
//         System.out.println(count);
//     }
// }


// 12) Count number of digits in a number
// for loop
// public class loop {
//     public static void main(String[] args) {
//         int num = 234567891;
//         int count = 0;
//         String s = String.valueOf(num);
//         for (int i = 0; i < s.length(); i++) {
//             count++;
//         }
//         System.out.println(count);
//     }
// }
// while loop
// public class loop {
//     public static void main(String[] args) {
//         int num = 234567891;
//         int count = 0;
//         int i = 0;
//         String s = String.valueOf(num);
//         while ( i < s.length()) {
//             count++;
//              i++;
//         }
//         System.out.println(count);
//     }
// }


// 13)Print cubes of numbers from 1 to 5
// for loop
// public class loop {
//     public static void main(String[] args){
//         for (int i = 1; i<6; i ++){
//             int cube = i * i * i;
//             System.out.println(cube);
//         }
//     }
// }
// while loop
// public class loop {
//     public static void main(String[] args){
//         int i = 1;
//         while ( i<6){
//             int cube = i * i * i;
//             System.out.println(cube);
//              i++;
//         }
//     }
// }

// 14) Find factorial of a number (e.g. 9)
// for loop
// public class loop{
//     public static void main(String[] args){
//         int n = 4;
//         int fact = 1;
//         for (int i = 1; i<=n; i++){
//             fact = fact * i;
//         }
//     System.out.println(fact);
//     }
// }
// while loop
// public class loop{
//     public static void main(String[] args){
//         int n = 5;
//         int i = 1;
//         int fact = 1;
//        while (i<=n){
//             fact = fact * i;
//             i++;
//         }
//     System.out.println(fact);
//     }
// }

// 15) Reverse a number (e.g. 123 → 321)
// for loop
// public class reversenumber{
//     public static void main(String[] args){
//         int num = 123;
//         int rev = 0;
//         for (;num!=0; num = num/10) {
//             int digit = num % 10;
//             rev = rev * 10 + digit; 
//         } System.out.println(rev);
    // }
// }
// while loop
// public class reversenumber{
//     public static void main(String[] args){
//         int num = 123;
//         int rev = 0;
//         while (num!=0 ) {
//             int digit = num % 10;
//             rev = rev * 10 + digit; 
//             num = num/10;
//         } System.out.println(rev);
//     } 
// }

// 16) Print elements of an array using loop
// for loop
// public class loop {
//     public static void main(String[]args){
//        int[] arr = {23,45,67,78};
//        for (int i = 0; i<arr.length; i++){
//         System.out.println(arr [i]);
//     }
// }
// }
// while loop
// public class loop {
//     public static void main(String[]args){
//        int[] arr = {23,45,67,78};
//        int i = 0;
//        while(i<arr.length){
//         System.out.println(arr [i]);
//         i++;
//     }
// }
// }
 
// 17) Find sum of array elements
// for loop
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {2,3,4,5,6};
//         int sum = 0;
//         for (int i = 0; i<arr.length;i++){
//             sum = sum + arr[i];
//         } System.out.println(sum);
//     }
// }
// while loop
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {50,60};
//         int sum = 0;
//         int i = 0;
//         while (i<arr.length){
//             sum = sum + arr[i];
//             i++;
//         } System.out.println(sum);
//     }
// }


// 18) Find maximum element in an array
// for loop
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {3,38,96,4,6,227};
//         int max = arr[0];
//         for (int i = 0; i <arr.length;i++){
//             if (arr[i] > max){
//                 max = arr[i];
//             } 
//         }System.out.println(max);
//     }
// }
// while loop
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {3,38,96,4,6,227};
//         int max = arr[0];
//         int i = 1;
//         while (i <arr.length){
//             if (arr[i] > max){
//                 max = arr[i];
//             } 
//             i++;
//         }System.out.println(max);
//     }
// }

// 19) Find minimum element in an array
// for loop
// public class loop{
//     public static void main(String[] args){
//         int[] arr = {88,78,9,43,67};
//         int min = arr[0];
//         for (int i = 1; i<arr.length; i++){
//             if (arr[i]< min){
//                 min = arr[i];
//             }
//         }System.out.println(min);
//     }
// }
// while loop
// public class loop{
//     public static void main(String[] args){
//         int[] arr = {88,78,9,43,67};
//         int min = arr[0];
//         int i = 1;
//         while (i<arr.length){
//             if (arr[i]< min){
//                 min = arr[i];
//             }
//             i++;
//         }System.out.println(min);
//     }
// }


// 20) Find second largest element in an array
// for loop
// public class loop{
//     public static void main(String[] args){
//         int[] arr = {88,78,9,43,67};
//         int max = arr[0];
//         int secondmax = arr [3];
//         for (int i = 0; i<arr.length; i++){
//             if (arr[i]>max){
//                 max = arr[i];
//                 secondmax = max;
//         } else if (arr[i]< max && arr[i] > secondmax) {
//             secondmax = arr[i];
            
//         }
//     }System.out.println(secondmax);
//    }
// }
// while loop
// public class loop{
//     public static void main(String[] args){
//         int[] arr = {88,78,9,43,67};
//         int max = arr[0];
//         int secondmax = arr [3];
//         int i = 0;
//        while (i<arr.length){
//             if (arr[i]>max){
//                 max = arr[i];
//                 secondmax = max;
//         } else if (arr[i]< max && arr[i] > secondmax) {
//             secondmax = arr[i];
            
//         }i++;
//     }System.out.println(secondmax);
//    }
// }

// 21) Find factorial of a number stored in a variable (change value and test)
// for loop
// public class loop{
//     public static void main(String [] args){
//         int n = 33;
//         int fact = 1; 
//         for (int i = 1;i<=n;i++) {
//             fact = fact * i;

//         } System.out.println(fact);
//     }
     
// }
// while loop
// public class loop{
//     public static void main(String [] args){
//         int n = 23;
//         int fact = 1; 
//         int i = 1;
//        while (i<=n) {
//             fact = fact * i;
//             i++;

//         } System.out.println(fact);
//     }
     
// }

// 22) Reverse a number 1234 → output 4321
// for loop
// public class reverse{
//     public static void main(String[] args) {
//         int num = 1234;
//         int rev  = 0;
//         for (;num!=0;num = num/10){
//             int digit = num % 10;
//             rev = rev*10 + digit;
//         } System.out.println(rev);  
//     }
// }
// while loop
// public class reverse{
//     public static void main(String[] args) {
//         int num = 1234;
//         int rev  = 0;
//         while (num!=0){
//             int digit = num % 10;
//             rev = rev*10 + digit;
//             num = num/10;
//         } System.out.println(rev);  
//     }
// }
// 23) Reverse a number 120 → output 21
// while loop
// public class reverse{
//     public static void main(String[] args) {
//         int num = 120;
//         int rev  = 0;
//         while (num!=0){
//             int digit = num % 10;
//             rev = rev*10 + digit;
//             num = num/10;
//         } System.out.println(rev);  
//     }
// }
// for loop
//  public class reverse{
//     public static void main(String[] args) {
//         int num = 120;
//         int rev  = 0;
//         for(;num!=0;num=num/10){
//             int digit = num % 10;
//             rev = rev*10 + digit;
//         } System.out.println(rev);  
//     }
// }
// 24) Check if 121 is palindrome
// public class loop{
//     public static void main(String[] args) {
//         int num = 121;
//         int original = num;
//         int rev = 0;
//         for (;num!=0;num = num/10){
//             int digit = num % 10;
//             rev = rev*10 + digit;
//         }
//         if (original == rev) {
//             System.out.println("num is palindrome");
//         }else{
//                 System.out.println("num is not palindrome");
//         }
//     }
// }
// while loop
// public class loop{
//     public static void main(String[] args) {
//         int num = 121;
//         int original = num;
//         int rev = 0;
//         while (num!=0){
//             int digit = num % 10;
//             rev = rev*10 + digit;
//             num = num/10;
//         }
//         if (original == rev) {
//             System.out.println("num is palindrome");
//         }else{
//                 System.out.println("num is not palindrome");
//         }
//     }
// }