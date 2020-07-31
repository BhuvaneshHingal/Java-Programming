import java.util.Scanner;
 
/*
 * Java Program to find volume and surface area of box using function
 */
public class VolumeOfBoxFunction {
 
    public static void main(String[] args) {
        double w; // Width of box
		double h; // Height of box
		double d; // Depth of box
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter Width of Box: ");
        w = scanner.nextDouble();
        System.out.println("Enter Height of Box: ");
        h = scanner.nextDouble();
        System.out.println("Enter Depth of Box: ");
        d = scanner.nextDouble();
 
        System.out.format("Surface Area of Box = %.3f\n", getSurfaceArea(w,h,d));
        System.out.format("Volume of Box = %.3f\n", getVolume(w,h,d));
    }
 
    /**
     * Returns total surface area of a box
     */
    public static double getSurfaceArea(double w, double h, double d) {
        /* Total surface area of Box , s = 2 (wh + hd + dw) */
        return 2*((w*h)+(h*d)+(d*w));
    }
 
    /**
     * Returns volume of a Box
     */
    public static double getVolume(double w, double h, double d) {
        /* Volume of Box ,v = w * h * d */
        return w * h * d;
    }
}