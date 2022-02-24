import java.io.*;
import java.util.*;

class Oddeven
{ 
  public static void main(String[] args)
  {
    System.out.println("Enter the Number");
    Scanner ob = new Scanner(System.in);
    String S = ob.nextLine();
    int num = Integer.parseInt(S);
    if(num % 2==0)
    System.out.println(" Even");
    else
    System.out.println(" Odd");

   }
}
