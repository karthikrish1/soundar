package collectionframework;

import java.util.Hashtable;
import java.util.TreeMap;

public class htb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable<Character,Integer>t= new Hashtable<>();
		t.put('p', 400);
		t.put('a', 900);
		t.put('c', 100);
		t.put('z', 600);
		t.put('d', 80);
		t.put('p', 900);
		System.out.println(t);
		
		//key
		t.remove('d');
		System.out.println(t);
		
		System.out.println(t.get('p'));
		
		System.out.println(t.keySet());
		
		System.out.println(t.values());
		
		System.out.println(t.entrySet());
	}

}
