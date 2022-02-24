import java.io.*;
import java.util.*;

import Calculator.*;

class MyCalculator
{
  public static void main(String args[])
  {
    int a,b,ch;
    Operations O = new Operations();
    System.out.println("*** Calculator ***");
    Scanner ob = new Scanner(System.in);
    System.out.println(" Enter two numbers ");
    a = ob.nextInt();
    b = ob.nextInt();
    do
    {
      System.out.println(" Enter your choice: \n1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Exit choice: ");
      ch = ob.nextInt();
      switch(ch)
      {
        case 1: 
                System.out.println(" Sum = "+ O.sum(a,b));
                break;
        
        case 2: 
                System.out.println(" Difference = "+ O.difference(a,b));
                break;
        
        case 3: 
                System.out.println(" Product = "+ O.product(a,b));
                break;
        
        case 4: 
                System.out.println(" Quotient = "+ O.quotient(a,b));
                break;
        
        default: System.out.println(" Exited Succesfully. ");
      }
    }while(ch<5);
   }

}   

/*
D:\Ashwin9136>javac MyCalculator.java

D:\Ashwin9136>java MyCalculator
*** Calculator ***
 Enter two numbers
10 5
 Enter your choice:
1.Add
2.Subtract
3.Multiply
4.Divide
5.Exit choice:
1
 Sum = 15
 Enter your choice:
1.Add
2.Subtract
3.Multiply
4.Divide
5.Exit choice:
2
 Difference = 5
 Enter your choice:
1.Add
2.Subtract
3.Multiply
4.Divide
5.Exit choice:
3
 Product = 50
 Enter your choice:
1.Add
2.Subtract
3.Multiply
4.Divide
5.Exit choice:
4
 Quotient = 2
 Enter your choice:
1.Add
2.Subtract
3.Multiply
4.Divide
5.Exit choice:
5
 Exited Succesfully.

D:\Ashwin9136>

*/ 

