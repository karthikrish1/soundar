package collectionframework;

import java.util.ArrayList;

public class l1 {

	public static void main(String[] args) {
		/*
		 * collection framework: store large amount of data under single name
		 * 
		 * list
		 * queue
		 * set
		 * map 
		 * table
		 * 
		 * List 
		 *    index based
		 *    add
		 *    remove
		 *    retrieve 
		 *    iteration
		 *    accept duplicates
		 *    
		 *    syntax:  ArrayList<Datatype> name= new ArrayList<>();
		 *   datatype    wrapper class
		 *   
		 *    int        Integer
		 *    String     String
		 *    char       Character
		 *    double     Double
		 *    float      Float
		 * 
		 * */
		ArrayList<Integer> n= new ArrayList<>();
		n.add(80);
		n.add(23);
		n.add(45);
		n.add(10);
		n.add(5);
		n.add(45);
		System.out.println(n);
		//    index     0    1    2     3     4     5  
		//              80   23   45   10     5    45
		
		// remove : know its index 
		n.remove(3);
		System.out.println(n);
		
		// retrieval : know the index
		System.out.println(n.get(3));
		
		//iteration: for each/enhanced for loop
		//syntax :  for(datatype tempvariable:namefothecollection)
		
		for(int x:n)
		{
			System.out.println(x);
		}
		
		
	}

}
