package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class que {
	public static void main(String[] args) {
		
		/*queue
		 *   not indexed
		 *   add 
		 *   remove
		 *   retrieve only head of the queue
		 *   iteration
		 *   accept duplicates
		 *   size limitation is there 
		 *   
		 *   ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size);
		 * 
		 * 
		 * */
		ArrayBlockingQueue<Character> n= new ArrayBlockingQueue<>(4);
		//String: 5 elements 
		n.add('a');
		n.add('p');
		n.add('w');
		n.add('x');
		System.out.println(n);
		
		n.remove('x');
		System.out.println(n);
		
		System.out.println(n.peek());
		
		for(char x:n)
		{
			System.out.println(x);
		}
		
	}

}
