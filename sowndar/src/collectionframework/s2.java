package collectionframework;

import java.util.TreeSet;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet: Float
		
		TreeSet<Integer>t= new TreeSet<>();
		t.add(80);
		t.add(8);
		t.add(0);
		t.add(20);
		t.add(30);
		t.add(0);
		System.out.println(t);
		
		t.remove(30);
		System.out.println(t);
		
		for(int x:t)
		{
			System.out.println(x);
		}
		

	}

}
