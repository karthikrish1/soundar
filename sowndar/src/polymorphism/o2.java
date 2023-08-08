package polymorphism;

public class o2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		o2 ob= new o2();
		ob.area();
		ob.area(3);
		ob.area(2.4);
		ob.area(3, 4.5);
		ob.area(3.2, 10);

	}
public  void area()
	{
		System.out.println("area");
	}
	
	public  void area(int s)
	{
		System.out.println("area of square is "+ s*s);
	}
	
	public  void area(double r)
	{
		System.out.println("area f circle is "+ 3.14*r*r);
	}
	
	public  void area(int a, double b)
	{
		System.out.println("area of rectangle is "+ a*b);
	}
	
	
	public  void area(double a, int b)
	{
		System.out.println("area of triangle is "+ 0.5*a*b);
	}
}
