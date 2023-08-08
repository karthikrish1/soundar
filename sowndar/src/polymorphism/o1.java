package polymorphism;

public class o1 {

	public static void main(String[] args) {
		// inheritance, polymorphism, abstraction and encapsulation
		
		// polymorphism- many forms
		// overloading and overriding 
		
		/*
		 * overloading: using same methodname for different purpose showing difference in number /datatype/sequence
		 * 
		 *              static, nonstatic, constructor * 
		 * */
		
		o1.area();
		o1.area(3);//s=3
		o1.area(3.2);
		o1.area(3, 4.5);
		o1.area(3.2, 10);

	}
	public static void area()
	{
		System.out.println("area");
	}
	
	public static void area(int s)
	{
		System.out.println("area of square is "+ s*s);
	}
	
	public static void area(double r)
	{
		System.out.println("area f circle is "+ 3.14*r*r);
	}
	
	public static void area(int a, double b)
	{
		System.out.println("area of rectangle is "+ a*b);
	}
	
	
	public static void area(double a, int b)
	{
		System.out.println("area of triangle is "+ 0.5*a*b);
	}

}
