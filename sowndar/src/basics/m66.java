package basics;

public class m66 {

	public static void main(String[] args) {
		
		//other than void
		   // add return statement at the end
		   // within sysout 
		
		m66 ob= new m66();
		System.out.println("Addition is "+ ob.addition());
		System.out.println("Welcome "+ ob.wish());
		
		// public: return age
		//private" div of 2 numbers
	}
	
	
	public int addition()
	{
		int m=40;
		int n=30;
		return m+n;
	}
	
	private String wish()
	{
		String n="gobika";
		return n+" good mrng";
	}

}
