package Practice;

public class StaticExample {
	static int a =10;   // static Varaible
	int b =20;
	
	static void m1()  // static method 
	{
		System.out.println("this is m1- static method");
	}
	
	 void m2()   // Non static method
	 { 
		 System.out.println("this is m2 - Non static method");
	 }

	 
	 void m3()
	 {
		 System.out.println("This me method ---- Non static");
		 
		 System.out.println(a);
		 System.out.println(b);
		 
		 m1();
		 m2();
	 }
	 
	 
	public static void main(String[] args) {
	
		// static methods can access only static stuff
		
		System.out.println(a);
		m1();
		
		//System.out.println(b); incorrect , bocz b is non -static
// m2(); incorrect , bocz m2 is non static method
		
		
		// static methods can also access  non static stuff but through object
		
		StaticExample se = new StaticExample();
		
		System.out.println(se.b);  // Non static varible throuhgt object
		se.m2();
		se.m3();
	}

}

