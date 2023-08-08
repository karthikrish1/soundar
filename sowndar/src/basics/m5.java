package basics;

public class m5 {
	public static void main(String[] args) {
		m5 ob= new m5();
		System.out.println(ob.add());
		System.out.println(ob.prod());
		System.out.println(ob.wish());
	}
	
	public int add()
	{
		int a=90;
		int b=80;
		return a+b;
	}
	
	private double prod()
	{
		double m=9.8;
		double n=9.0;
		return m*n;
	}
	
	public String wish()
	
	{
		String n="good mrng";	
		return n ;
	}

}
