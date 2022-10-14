
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
  
  
----------CODE----------
	
public class SandglassStarPattern
{
	public static void main(String args[])
	{
		int n = 5;
		
		for(int line=1; line<=5; line++)
		{
			for(int space = 1; space<=line; space++)
			{
				System.out.print(" ");
			}
			for(int i = n; i>=line; i--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int line=1; line<=5; line++)
		{
			for(int space=n; space>=line; space--)
			{
				System.out.print(" ");
			}
			for(int i=1; i<=line; i++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
