import java.util.*;
class CalculateSimpleInterest
{
	double principal; 
    double time; 
    double rate; 
	
	//assign the value to the object	
	public void getValue()
	{
		System.out.println("Enter Principal amount: "); //For eg: Rs. 5000
		Scanner sc = new Scanner(System.in);
		principal = sc.nextDouble();
		System.out.println("Enter the time period: "); //For eg: 2 years
		time = sc.nextDouble();
		System.out.println("Enter the rate of interest: "); //For eg: 11.25 % per annum
		rate = sc.nextDouble();
	}
	public double calculateInterest()
    {
        double result;
		result = (principal * time * rate) / 100.0;
        return result;
    }
    
   /* public void printSummary(double p, double t, double r, double interest)
    {
        System.out.print("Interest for Rs " + p + " for " + t + " years ");
        System.out.print("at the rate of " + r + "% p.a. is Rs " + interest);
    }*/
}
public class SimpleInterest	
{
	public static void main(String[] args)
	{
		CalculateSimpleInterest interest = new CalculateSimpleInterest();   // A default constructor is called
		interest.getValue();
		interest.calculateInterest();	
		System.out.print("Interest for Rs " + interest.principal + " for " + interest.time + " years ");
		
        System.out.print("at the rate of " + interest.rate + "% p.a. is Rs " + interest.calculateInterest());
	}
	
}