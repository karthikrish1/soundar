package basics;

public class m2 {

	public static void main(String[] args) {
		
		//void: doesnot return anything
		
		// return type other than void= > ing,double, float, string, char, boolean
		
		// add return statement at the end
		// call it within sysout statement 
		
		System.out.println("Addition is " +m2.add());
		System.out.println(m2.area());
		
		//publi: return average of three numbers
		// private return perimter of square 
		
	}
	public static int add()
	{
		int a=4;
		int b=30;
		int c=a+b;
		return c;
	}
	
	private static double area()
	{
		double r=3.2;
		return 3.14*r*r;
	}
}
