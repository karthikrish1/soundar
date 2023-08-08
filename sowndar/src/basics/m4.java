package basics;

public class m4 {

	public static void main(String[] args) {
		
		//classname objectname= new classname();
		// objectname.methodname();
		m4 ob= new m4();
		ob.square();
		ob.details();
		
		// perimeter of square: public\
		// div of two numbers: private 

	}
	
	public void square()
	{
		int s=3;
		System.out.println("Area of squaare is "+ s*s);
	}
	
	private void details()
	{
		String n="dhivya";
		int age=30;
		System.out.println("NAme is "+ n);
		System.out.println("Age is "+ age);
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
 * non static:  doesnot contain fixed memory space, we need to allocate
 * 
 * syntax for creation:  accessmodifier  returntype name(){}
 * syntax for calling:   step1: creating and naming object    classname objectname= new classname();
 *                                                            objectname.methodname();
 * 
 * 
 * accessmodifier:  public, private, protected
 * returntype: int, float, double, boolean, string, int. char 
 * */