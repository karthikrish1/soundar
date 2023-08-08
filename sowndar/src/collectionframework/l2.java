package collectionframework;

import java.util.ArrayList;

public class l2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Boolean> n= new ArrayList<>();
		n.add(true);
		n.add(false);
		n.add(false);
		n.add(true);
		n.add(false);
		n.add(true);
		System.out.println(n);
		//    index     0    1    2     3     4     5  
		//             hi    bye  come  go    hi    no   
		// remove : know its index 
		n.remove(3);
		System.out.println(n);
		
		// retrieval : know the index
		System.out.println(n.get(3));
		
		//iteration: for each/enhanced for loop
		//syntax :  for(datatype tempvariable:namefothecollection)
		
		for(boolean x:n)
		{
			System.out.println(x);
		}
	}

}
