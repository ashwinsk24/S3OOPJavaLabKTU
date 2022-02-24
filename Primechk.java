import java.io.*;
import java.util.*;

class PrimeMain

{
  public static void main(String [] args)
  { 
    System.out.println(" Enter a number ");
    Scanner ob = new Scanner(System.in);
    int num = ob.nextInt();
    int i,c=0;

    for(i=1;i<=num;i++)
    {
      if(num % i == 0)
       { 
         c++;
       }
    } 
        
    if(c==2)
       {
         System.out.println(num + " is a Prime number ");
       }
      else
      System.out.println(num + " is NOT a Prime number ");
   } 
}