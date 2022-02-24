import java.io.*;
import java.util.*;

class Stringrev
{ 
  public static void main(String[] args)
  {
    System.out.println("Enter the string ");
    Scanner ob= new Scanner(System.in);
    String S = ob.nextLine();
    String rev= "";
    int l = S.length()-1;
    int i=0,c=0;
    for(i=0;i<=l;i++)
     {
      rev=S.charAt(i)+rev; 
      }
  
    System.out.println("Reversed string= "+rev);
  }
}