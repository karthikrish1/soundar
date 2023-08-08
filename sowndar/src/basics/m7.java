package basics;

public class m7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parameter: variable passed to a function definition
		//argument: value assigned to the parameter while calling 

		
		m7 b=new m7();
		b.rect(3, 4);
		System.out.println(b.n('l'));
		
	}
	
	public void rect(int l, int b)
	{
		System.out.println("Area of rectangle is "+ l*b);
	}
	
	
    public char n(char let)
    {
    	return let;
    }
}
