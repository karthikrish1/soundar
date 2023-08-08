package encpsultion;

public class e1 {
	/*encapsulation: data hiding
	 * 
	 * declare -> private
	 * must not assign value strghtly
	 * access => setter and getter
	 * 
	 * settter: assign 
	 * getter: view
	 * 
	 * public, nonstatic
	 * * 
	 * */
	
	private String password;
	
	public void set(String p)
	{
		password=p;
	}
	
	public void get()
	{
		System.out.println(password);
	}

}
