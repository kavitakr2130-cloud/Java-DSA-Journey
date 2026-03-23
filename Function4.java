import java.util.*;
public class Function4{
    public static int printAverage(int a, int b, int c){
        int mean = (a+b+c)/3;
        return mean;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        System.out.print("Enter c = ");
        int c = sc.nextInt();
        printAverage(a,b,c);
        System.out.println("The average is "+printAverage(a,b,c));
    }
}