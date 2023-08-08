package inheritance;

public class child extends parent{

	public static void main(String[] args) {
	
		
		//calling its own methods
		child.cs();
		child ob= new child();
		ob.cn();
		
		//after inheritance
		child.ps();//calling parent class static method using child name
		ob.pn();//calling parent nonstatic method using child object 

	}
	public static void cs()
	{
		System.out.println("child static");
	}
	
	public void cn()
	{
		System.out.println("child nonstatic");
	}

}
