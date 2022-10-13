 public class Main
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
                    for(int i=1; i<=(2*line)-1; i++)
                      {
                        System.out.print("*");
                      }
                    System.out.println("");
                  }

          for(int line=1; line<=n-1; line++)
            {
              for(int space = 1; space<=line; space++)
                {
                  System.out.print(" ");
                }
              for(int j=(2*n)-3; j>=(2*line)-1; j--)
                {
                  System.out.print("*");
                }
              System.out.println("");
            }    

              
        }
 }
