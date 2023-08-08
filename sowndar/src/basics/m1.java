package basics;

public class m1 {

	public static void main(String[] args) {
		
		m1.area();
		m1.add();

		
	}
	
	//accessmodifier static retuntype name(){}
	
	public static void area()
	{
		int s=4;
		System.out.println("Area of square is "+ s*s);
	}
	
	private static void add()
	{
		double a=3.4;
		double b=2.3;
		System.out.println("Addition of two numbers "+ (a+b));
	}
	
	

}

/*
 * method: block of code which performs certain action
 * 
 * static, nonstatic
 * 
 * methods should be created outside the main method, inside the class
 * methd should be called inside the main methd
 * 
 * static:  fixed memory space
 * 
 * syntax for creation:  accessmodifier static returntype name(){}
 * syntax for calling:   classname.methodname();
 * 
 * accessmodifier:  public, private, protected
 * returntype: int, float, double, boolean, string, int. char 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 