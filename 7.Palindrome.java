import java.io.*;
import java.util.*;

class Palindrome
{ 
  public static void main(String[] args)
  {
    System.out.println("Enter the string ");
    Scanner ob= new Scanner(System.in);
    String S = ob.nextLine();
    int l = S.length()-1;
    int i=0,c=0;
      while(i<=l)
      {
         if(S.charAt(l)==S.charAt(i))
           { i++;
             c++;
             l--;
           }
     }
    if(c==i)
    {
      System.out.println(" String is palindrome");
    } 
   else System.out.println("  string is NOT PALINDROME");
  }
}
