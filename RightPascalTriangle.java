* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
  
  
----------CODE----------
  
public class RightPascalTriangle
{
	public static void main(String args[])
	{
		int n = 5;
		
		for(int line=1; line<=n; line++)
		{
			for(int i=1; i<=line; i++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int line = n-1; line>=1; line--)
		{
			for(int i=1; i<=line; i++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
