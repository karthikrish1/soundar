package builtings;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String: datatype/class
		// nonstatic in nature
		
		//n=> variable and object 
		String n="Welcome";
		
		//  index    0   1   2  3    4    5    6
		//           W   e   l   c   o    m    e
		System.out.println(n.length());
		
		System.out.println(n.indexOf('m'));
		
		System.out.println(n.charAt(1));
		
		//conversion
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		//joining
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		//replacement
		System.out.println(n.replace('l', 'z'));
		System.out.println(n.replace("come", "go"));
		
		//cntains
		System.out.println(n.contains("come"));
		
		

	}

}
