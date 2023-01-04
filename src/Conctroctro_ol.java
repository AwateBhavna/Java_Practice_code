
public class Conctroctro_ol {
	int a , b ; //instance varaibles or class varaibles
	void getValues(int a,int b)
	{
		this.a =a;  // this Keyword
		this.b=b;
	}
void printvalues()
{
	System.out.println(a);
	System.out.println(b);
}
	public static void main(String[] args) {
		Conctroctro_ol co = new Conctroctro_ol();
		co.getValues(10, 20);
		co.printvalues();
		

	}

}


