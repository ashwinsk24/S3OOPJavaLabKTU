import java.io.*;
import java.util.*;

import primepackage.*;

class PrimeMain
{
  public static void main(String args[])
  {
    int n;
    Prime1 p = new Prime1();
    Scanner ob = new Scanner(System.in);
    System.out.println(" Enter the number to be checked ");
    n = ob.nextInt();

    if(p.checkp(n)==1)
      {
        System.out.println(" Number is Prime ");
      }
       else
        System.out.println(" Number is NOT Prime ");
   }
}


/*
 Enter the number to be checked
5
 Number is Prime

 Enter the number to be checked
6
 Number is NOT Prime
*/