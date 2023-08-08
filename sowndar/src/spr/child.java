package spr;

public class child extends parent{

	int a=70;
	public static void main(String[] args) {
		
		child c= new child();
		c.d();
	}
	
	public void d()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}
