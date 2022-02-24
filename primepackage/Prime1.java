package primepackage;
import java.io.*;
import java.util.*;

public class Prime1
{
  public static int checkp(int n)
  {
    int i,c=0;
    for(i=2;i<n;i++)
    {
      if(n%i==0)
       {
         c++;
       }
    }
    if(c==0)
      return 1;
    else
      return 0;
  }
}