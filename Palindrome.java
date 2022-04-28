import java.io.*;
import java.util.*;

class Palindrome
{ 
  public static void main(String[] args)
  {
    System.out.println("Enter the string ");
    Scanner ob= new Scanner(System.in);
    String S = ob.nextLine();
    String rev = "";
    int l = S.length();
    int i=0;
      for(i=l-1; i>=0; i--)
       {
         rev = rev + S.charAt(i);
       }
    if(S.equals(rev))
    {
      System.out.println(" String is Palindrome ");
    } 
   else System.out.println("  String is NOT Palindrome ");
  }
}
