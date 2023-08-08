package loops;

public class s1 {

	public static void main(String[] args) {
		/*
		 * int, string, char, boolean
		 * switch(expresssion)
		 * {
		 * case:
		 *    statement
		 *    break;
		 * 
		 * * case:
		 *    statement
		 *    break; 
		 * 
		 *  * case:
		 *    statement
		 *    break;
		 *    
		 *  default:
		 *     statement
		 *     break;
		 * 
	* 
		 * 
		 * */
		int age=0;
		switch(age)
		{
		case 0:
			System.out.println("new born");
			break;
			
		case 4:
			System.out.println("toddler");
			break;
			
		case 18:
			System.out.println("adult");
			break;
			
		default:
			System.out.println("doesnot match");
			break;
		}
		
		String fruits="apple";
		switch(fruits)
		{
		case "orange":
			System.out.println("orange is ornge n color");
			break;
			
		case "apple":
			System.out.println("an apple  day");
			break;
		default:
			System.out.println("doesnot match");
			break;
			
		}

	}

}
