import java.io.*;
import java.util.*;
class Bank {
	private String nameOfDepositor;
	private int accNum;
	private boolean accType;
	private double bal, AnnualInterestrate;
	void set(String n,int num,boolean acc,double B, double rate) {
	nameOfDepositor=n;accNum=num;accType=acc;bal=B;AnnualInterestrate=rate;
	}
	void deposit(double d) { bal+=d; }
	void withdraw(double w) {
		if(bal>=w && bal-w>50)
			bal-=w;
		else
			System.out.println("Insufficient Balance in your account");
		}
	void disp() {
		System.out.println("Name of account Holder is :"+nameOfDepositor);
		System.out.println("Current Balance in your Savings Bank account is :"+bal );
		
		}
	double Get_Monthly_interestRate()
    {
        AnnualInterestrate=((0.01*AnnualInterestrate)/12);
        return AnnualInterestrate;
    }
    void Get_Monthly_interest()
    { 
		System.out.println("Monthly Interest for the available account balance is Rs. "+bal*Get_Monthly_interestRate());
    }
}
	
public class BankAccount {
	public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	System.out.println("\n*******************WELCOME TO JAVA BANK********************");
	System.out.print("Please enter your name :");
	String s=in.readLine();
	System.out.print("\nPlease enter your account number :");
	int no=Integer.parseInt(in.readLine());
	System.out.print("\nDo you have Savings Account at our branch?");
	boolean ss=sc.nextBoolean();
	 if(ss==true)
        {
            System.out.println("You can proceed.... ;) ");
        }
        else
        {
            sc.close();
        }
	System.out.print("\nEnter balance of your account: ");
	double bl=Double.parseDouble(in.readLine());
	System.out.println("Enter Annual Interest Rate in Percentage: ");
    double r=sc.nextDouble();
	
	Bank ob=new Bank();
	ob.set(s,no,ss,bl,r);
	ob.disp();
	System.out.print(" YOU WANT TO WITHDRAW MONEY(Y/N) : ");
	String w=in.readLine();
	if(w.equalsIgnoreCase("y"))
	{
		System.out.print("\nEnter amount : ");
		double amnt=Double.parseDouble(in.readLine());
		ob.withdraw(amnt);
		ob.disp();
		ob.Get_Monthly_interest();
		System.out.println("*******************THANKS FOR USING JAVA BANK*****************");
		System.exit(0);
	}
  }
}