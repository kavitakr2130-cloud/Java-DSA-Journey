import java.util.Scanner;

public class Function5{
    public static int calculateSUMOFODD(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of integers = ");
    int n = sc.nextInt();
        calculateSUMOFODD(n);
        }
}
