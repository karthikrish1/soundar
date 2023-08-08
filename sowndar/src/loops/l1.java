package loops;

public class l1 {

	public static void main(String[] args) {
		/*
		 * initialisation:    where to start
		 * 
		 * cond :             where to stop
		 *                    frwrd: <=end value
		 *                    backwrd: >=end value
		 *                    
		 *                    
		 *inc/de    :        diff btwn 2 numbers
		 *           
		 * 
		 * 
		 * initialisation
		 * while(con)
		 * {
		 * state
		 * inc/dec
		 * }
		 * 
		 * 
		 * 50,52,54...60
		 * 1,3,5..13
		 * 
		 * 70,63...0
		 * */
		int i=50;
		while(i<=60)
		{
			System.out.println(i);
			i=i+2;
		}
		
		int a=70;
		while(a>=0)
		{
			System.out.println(a);
			a=a-7;
		}

	}

}
