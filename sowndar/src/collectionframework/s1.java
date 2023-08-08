package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {

	public static void main(String[] args) {
		/*
		 * set
		 *   not indexed
		 *   add
		 *   remove
		 *   retrival is not possible
		 *   iteration
		 *   will not accept duplicates 
		 *   
		 *   TreeSet:   alphabetical/ascending order
		 *   LinkedHashset: insertion order
		 *   Hashset: unpredictable order
		 * * 
		 * */
		
		TreeSet<Integer>t= new TreeSet<>();
		t.add(80);
		t.add(8);
		t.add(0);
		t.add(20);
		t.add(30);
		System.out.println(t);
		
		
		LinkedHashSet<Integer>t1= new LinkedHashSet<>();
		t1.add(80);
		t1.add(8);
		t1.add(0);
		t1.add(20);
		t1.add(30);
		System.out.println(t1);

		
		HashSet<Integer>t11= new HashSet<>();
		t11.add(80);
		t11.add(8);
		t11.add(0);
		t11.add(20);
		t11.add(30);
		System.out.println(t11);

	}

}
