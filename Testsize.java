import java.io.*;
import java.util.*;

class Testsize
{
  public static void main( String args[] )
  { 
    
    Scanner ob = new Scanner(System.in);
    try
    {
     int i,n;
     int[] A = new int[-3];
     System.out.println(" Enter the Array Size ");
     n = ob.nextInt();
     System.out.println(" Enter the Elements ");
     for(i=0;i<n;i++)
       {
         A[i]=ob.nextInt();
       }
     
     for(i=0;i<n;i++)
       {
         System.out.print("Array: "+A); 
       }
     
    }
                                       
    catch(Exception e)
    {
      System.out.println(" Caught in Exception " +e);
    }

  }
}                              













