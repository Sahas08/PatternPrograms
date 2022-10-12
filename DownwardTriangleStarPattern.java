* * * * * 
* * * * 
* * * 
* * 
* 
  
----------CODE----------
  
 public class DownwardTriangleStarPattern
 {
        public static void main(String args[])
        {
                int n = 5;
                
                for(int line=1; line<=n; line++)
                {
                        for(int i=line; i<=n; i++)
                        {
                                System.out.print("* ");
                        }
                        System.out.println("");
                }
        }
 }
 
