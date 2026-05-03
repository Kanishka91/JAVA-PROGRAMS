import java.util.Random;
import java.util.Scanner;
public class tan1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter angle (tan): ");
        double degree = sc.nextDouble();
        double radian = Math.toRadians(degree);
        double tanValue = Math.tan(radian);
        System.out.println("tan = " + tanValue);

        
        System.out.print("Enter angle (cos): ");
        double degree1 = sc.nextDouble();
        double radian1 = Math.toRadians(degree1);
        double cosValue = Math.cos(radian1);
        System.out.println("cos = " + cosValue);

        
        System.out.print("Enter angle (sin): ");
        double degree2 = sc.nextDouble();
        double radian2 = Math.toRadians(degree2);
        double sinValue = Math.sin(radian2);
        System.out.println("sin = " + sinValue);

        Random r = new Random();

        double a = r.nextDouble();  
        double b = r.nextDouble();  

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("abs(a) = " + Math.abs(a));


        System.out.println("max(a, b) = " + Math.max(a, b));


        System.out.println("min(a, b) = " + Math.min(a, b));

        System.out.println("sqrt(a) = " + Math.sqrt(a));
        System.out.println("cbrt(a) = " + Math.cbrt(a));        
    
        System.out.println("pow(a, 2) = " + Math.pow(a, 2));

    
        System.out.println("floor(a) = " + Math.floor(a));
        System.out.println("ceil(a) = " + Math.ceil(a));

    
        System.out.println("round(a) = " + Math.round(a));
    }

}