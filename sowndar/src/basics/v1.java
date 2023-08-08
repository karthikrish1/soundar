package basics;

public class v1 {

	public static void main(String[] args) {
		
		//variable : name given to a memory location
		//syntax:   datatype variablename =value;
		
		/*
		 * word:     String
		 * 
		 * letter:   char
		 * 
		 * number:   int, double, float
		 * 
		 *           double: store utp 16 digits after decimal point
		 *           
		 *           float:  store upto 8 digits after decimal, add f at the end
		 *           
		 * 
		 * true/false : boolean
		* 
		 * 
		 * */
		
		// datatype variablename =value;
		String n="dhivya";
		int age=30;
		char l='k';
		double height=153.2;
		float weight=60.3f;
		boolean r1=true;
		
		System.out.println("Name is"+ n);
		System.out.println("age is"+ age);
		System.out.println("Initial is "+ l);
		System.out.println("Height is "+ height);
		System.out.println("Weight is"+ weight);
		System.out.println("Result is "+ r1);
		m1.area();
		//m1.add();
		
		//area of square: side*side
		// area of rectangle: l*b
		// area of circle" 3.14*r*r
		//average : (a+b)/2
		//product: a*b
		// addition : a+b
		//subtraction: a-b
		
		//area of traiangle: 0.5*b*h
		// area of semi: 2*3.14*r
		
		
		int side=99489999;
		System.out.println("Area of square is "+ side*side);
		
		double r=3.3;
		System.out.println("Area of circle is "+ 3.14*r*r);
		
	}

}
