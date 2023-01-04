
public class concat {
	public static void main(String[] args) {
		String s= "Welcome";
		String s1 ="to Java";
		
		System.out.println(s.length());  //length of String
		System.out.println(s.concat(s1));  // Joining of String
		
		s= "   Akash    ";
		System.out.println("Befor triming string:" +s); //remove space
 System.out.println("After triming:" +s.trim());      //trimg after
	}

}
