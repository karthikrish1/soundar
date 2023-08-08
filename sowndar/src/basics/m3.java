package basics;

public class m3 {
public static void main(String[] args) {
	
	//parameters: variable passed to a function definition   :   datatype variablename
	// arguments: value assigned to the parameter while calling it
	
	//variable declaration: datatype variablename=value
	
	m3.area(6);// side=6    ;  6=> argument
	m3.area(7);
	m3.details("sowndar", 20);
	
}

public static void area(int side)//parameter 
{
	System.out.println("Area of square is "+ side*side);
	}

private static void details(String name, int age)
{
	System.out.println("Name is "+ name);
	System.out.println("Age is "+ age);
	}
}
