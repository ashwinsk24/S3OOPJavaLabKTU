import java.io.*;
import java.util.*;

interface Test
{
  public int square(int a);
}

class arithmetic implements Test
{
  int s=0;
  public int square(int b)
  {
    int s= b*b;
    System.out.println(" Square of "+ b + "=" + s);
    return s; 
  }
}

class ToTestInt
{
  public static void main(String args[])
  {
    Test T = new arithmetic();
    Scanner ob = new Scanner(System.in);
    System.out.println(" Enter the no. to be Squared: "); 
    int n = ob.nextInt();
    T.square(n);   
  }
} 
  