class Fan
{
	public static final int SLOW=1,MEDIUM=2,FAST=3; // static final attributes with constant values
	private int speed;
	private boolean f_on;
	private double radius;
	private String color;
	
	Fan()
    {
        speed=SLOW;
        f_on=false;
        radius=5;
        color="blue";
    }
 
	Fan(int speed,double radius,String color,boolean f_on) //Constructor to store values
	{
		this.speed=speed;
		this.radius=radius;
		this.color=color;
		this.f_on=f_on;
	}
 
	public void tostring() // toString method used to return String data of Fan
	{
		if(f_on==true) // Checking Whether Fan is on/off
		{
			System.out.println("Fan is on \n the speed is ="+speed+"\n the color is ="+color+"\n the radius is ="+radius);
		}
		else
		{
			System.out.println("Fan is off \n the color of fan is ="+color+"\n the radius of fan is ="+radius);
		}
	}
 
		public static void main(String[] args)
		{
			Fan obj1 = new Fan(FAST,10,"yellow",true);
			Fan obj2 = new Fan(MEDIUM,5,"blue",false);
			obj1.tostring();
			obj2.tostring();
		}
}
