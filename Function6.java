import java.util.Scanner;
//import static java.io.IO.println;


public class Function6 {
    public static void greater(int a, int b) {
        if (a > b) {
            System.out.print("a is greater than b");
        } else if (b > a) {
            System.out.print("b is greater than a");
        }else{
            System.out.print("Equal");
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number a = ");
            int a = sc.nextInt();
            System.out.println("Enter the number b = ");
            int b = sc.nextInt();
            greater(a, b);
        }
    }
