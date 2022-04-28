import java.io.*;
import java.util.*;

class HelloOutput
{ 
  public static void main(String[] args)
  {
    System.out.println("Enter the string");
    Scanner ob = new Scanner(System.in);
    String S = ob.nextLine();
    System.out.println("Hello "+ S);
    ob.close();
   }
}
