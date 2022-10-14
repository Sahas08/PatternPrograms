10101
01010 -
10101
01010 -
10101
	

----------CODE----------
	
public class BinaryNumberPattern
{
	public static void main(String args[])
	{
		int n = 5;
		int mod=0;
		
		for(int line=1; line<=n; line++)
		{
			mod = line%2;
			
			for(int i=1; i<=n; i++)
			{
				if(mod==0)
				{
					if(i%2==0)
					{
						System.out.print("0");
					} else {
						System.out.print("1");
					}
				} else {
					if(i%2==0)
					{
						System.out.print("1");
					} else {
						System.out.print("0");
					}	
				}
			}
			System.out.println("");
		}
	}
}
