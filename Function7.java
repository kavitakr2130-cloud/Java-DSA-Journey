import java.util.Scanner;

public class Function7{
    public static float calculateCircumference(float r){
        float circumference =  2*3.14f*r;
        System.out.println("The circumference of the circle is "+circumference);
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        float r = sc.nextFloat();
        calculateCircumference(r);
    }
}

