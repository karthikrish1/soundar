package polymorphism;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        c1 ob= new c1();
		c1 ob1= new c1(3);
		c1 ob2= new c1(2.3);
		c1 ob3= new c1(10,3.4);
		c1 ob4= new c1(20.5,4);
	}
	public c1()
	{
		System.out.println("im constructor");
	}
	
	public c1(int s)
	{
		System.out.println("Square "+s*s);
	}
	
	public c1(double r)
	{
		System.out.println("circle is "+ 3.14*r*r);
	}
	
	public c1(int a, double n)
	{
		System.out.println("rectangle is "+ a*n);
	}
	
	public c1(double n, int a)
	{
		System.out.println("triangle is "+ n*a*0.5);
	}

}
