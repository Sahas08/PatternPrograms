    *
   **
  ***
 ****
*****

----------CODE----------
      
public class LeftTriangleStarPattern
{
    public static void main(String args[])
    {
        int n = 5;
      
        for(int line=1; line<=n; line++)
        {
            for(int space=1; space<=n-line; space++)
            {
                System.out.print(" ");
            }
          
            for(int i=1; i<=line; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
