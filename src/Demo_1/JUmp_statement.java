package Demo_1;

public class JUmp_statement {
	public static void main(String[] args) {
		/*for(int i=1; i<=25; i++)
		{ 
			if(i == 20)
			{
				break;		
		}
		System.out.println(i);
		
		}*/
		for (int i=1; i<=10;i++)
		{
			if(i==3 || i==5 || i==7)
			{
				continue;
			}
		
				System.out.println(i);
			}
			
	}
}
