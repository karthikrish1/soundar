package exceptionhandling;

public class e1 {
	
	//exceptions: error
	
	//checked exception
	//unchecked exceptions 
	
	public static void main(String[] args) {
		
		//try, catch->
		//throw
		//throws 
		
		//try: code which is having prob of getting error
		//catch: which will be executed when error occurs 
		
		try {
		System.out.println(3/1);
		}
		catch(Exception e)
		{
			System.out.println("error is" + e);
		}
		
		finally
		{
			System.out.println("bye");
		}
		
	}

}
