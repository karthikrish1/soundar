package Inte;

public interface intro {
	
	/*interface
	 *    blue print of class
	 *    cannot have static method
	 *    can have nonstATIC METHOD WITH default keyword
	 *    can have abstract method
	 *    abstract method  
	 *           nonstatic
	 *           empty 
	 *           will be redefined in class to which interface connects to
	 *           no abstract ke    class<=> class:   extends
	 *    class<=> interface: implements
	 *    
	 *       class definition: implements interfacename 
* 
	 * */
	default public void nm()
	{
		System.out.println("nonstatic methd");
	}
	
	public void ab();

}
