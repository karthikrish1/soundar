package exceptionhandling;

import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create exceptions when condition met
		// throw new exceptionname("message")
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=s.nextInt();
		if(age>18)
		{
			System.out.println("major");
		}
		else
		{
			throw new ArithmeticException("u cannt vote");
		}
	}

}
