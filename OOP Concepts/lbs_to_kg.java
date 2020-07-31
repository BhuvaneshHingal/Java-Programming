import java.util.Scanner;
class weight{
	static double pound;
	static double result;
	public static double pound(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter data for conversion from lbs to kg: ");
		pound = sc.nextDouble();
		return pound;
	}
	public static double conversion_lbstokg(){
		result = 1;
		result = pound*0.4536;
		return result;
	}
	      
  }
public class lbs_to_kg{
		
	public static void main(String[] args) {
    weight type = new weight();
	type.pound();
    System.out.println("After Conversion: " + type.conversion_lbstokg() + "kg");	
	}
}