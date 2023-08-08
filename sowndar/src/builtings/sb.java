package builtings;

public class sb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer n= new StringBuffer("Welcome");
	//  index    0   1   2  3    4    5    6
	//           W   e   l   c   o    m    e
			System.out.println(n.length());
			System.out.println(n.indexOf("m"));
			System.out.println(n.charAt(1));
			
			//inserting, appending
			System.out.println(n.append("hi"));
			
		//  index    0   1   2   3    4    5    6    7
			//       W   o   e   l   c     o    m    e
			
			System.out.println(n.insert(1, 'O'));
			//deleting
			
			System.out.println(n.deleteCharAt(1));
		//  index    0    1    2   3    4    5    6    7
		//           W     e   l    c     o    m    e
			System.out.println(n.delete(3, 6));// end index is exclusive 
			System.out.println(n.reverse());
			System.out.println(n.reverse());
			System.out.println(n.replace(0, 2, "KK"));//0,1
			
	}

}
