package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * container where elements will be stored alng with its key
		 * key: any datatype
		 * element: any datatype
		 * 
		 * add
		 * rmve
		 * retrive
		 * 
		 * TreeMap      : keys: alphabetical order/ascending order 
		 * LinkedHashMap:  keys: insertion order 
		 * HashMap    : keys: unpredictable order 
		 * 
		 * TreeMap<dtypeofkey,dtypeofelement> name= new TreeMap<>();
		 * * 
		 * key: char
		 * element: integer
		 * 
		 * key: integer
		 * element: String
		 * 
		 * */
		
		TreeMap<Character,Integer>t= new TreeMap<>();
		t.put('p', 400);
		t.put('a', 900);
		t.put('c', 100);
		t.put('z', 600);
		t.put('d', 80);
		t.put('p', 900);
		System.out.println(t);
		
		LinkedHashMap<Character,Integer>t1= new LinkedHashMap<>();
		t1.put('p', 400);
		t1.put('a', 900);
		t1.put('c', 100);
		t1.put('z', 600);
		t1.put('d', 80);
		System.out.println(t1);
		
		HashMap<Character,Integer>t11= new HashMap<>();
		t11.put('p', 400);
		t11.put('a', 900);
		t11.put('c', 100);
		t11.put('z', 600);
		t11.put('d', 80);
		System.out.println(t11);
		

	}

}
