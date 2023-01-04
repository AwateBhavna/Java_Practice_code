package Program;

public class reverse_string {
	public static void main(String[] args) {
		String name = "Bhouramma";
		String str1 = " ";
		int leng =name.length();
		System.out.println(leng);
		
for (int i=leng-1;i>=0;i--)
{
	str1= str1+name.charAt(i);
		}			
			
System.out.println(str1);
	

}
}