package inheritance;

public class parent {
	
	/*
	 * inheritance: process in wchih one class acquires properties of other class
	 * 
	 * parent/super/base :  class whose properties are inherited
	 * child/derived/sub:   class which uses propertes ofmparent
	 * 
	 * child is using parent class properties
	 * 
	 * to achieve:  child class defi=> extends parent class name
	 * 
	 * single:  parent<=> child
	 * multiple: parent1,parent2<=> child  
	 * hierrarchial: paret<=> child1,child2
	 * 
	 * 
	 * */
	
	protected static void ps()
	{
		System.out.println("parent static");
	}
	
	public void pn()
	{
		System.out.println("parent nonstatic");
	}

}
