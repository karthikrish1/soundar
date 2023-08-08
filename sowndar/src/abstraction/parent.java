package abstraction;
abstract public class parent {
	/*abstraction: hiding implementation details
	 * * follows inheritance
	  * abstract class and abstract method
	 * * class=> abstract class=> add abstract keyword before it
	 * abstract class=> nrml method and abstract method
	 * * abstract method 
	 *            nonstatic
	 *            abstract keyword 
	 *            will be empty in its class, will be redefined in its derived class
	 * cannot create an object for abstract class * 
	 * 
	 * 
	 * */
	public void nm()
	{
		System.out.println("nrml method");
	}

	abstract public void ab();
}
