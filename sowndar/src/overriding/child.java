package overriding;

public class child extends parent{
	public static void main(String[] args) {
		//same methodname for diff purpose
		//  diff n location
		// nonstatic
		
		// method: parent: overriden  => parent
		//method: child: overriding=> child 
		
		
		parent p=new parent();
		p.area();
		
		child c=new child();
		c.area();
	}
	
	public void area()
	{
		int r=9;
		System.out.println("circle is  "+ 3.14*r*r);
	}


}
