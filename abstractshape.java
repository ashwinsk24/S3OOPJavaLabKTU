import java.io.*;
import java.util.*;

abstract class Shape
{
  int nos;

 abstract void numberofSides();

 Shape(int s)
 {
   nos = s;   
 }

}
  
 class Rectangle extends Shape
 {
  Rectangle(int s)
   {
    super(s);
   }

 void numberofSides()
  {
    
    System.out.println(" Number of sides of Rectangle=" + nos);
  
  }
}

 class Triangle extends Shape
 {
  Triangle(int s)
   {
    super(s);
    }

 void numberofSides()
  {
    System.out.println(" Number of sides of Triangle=" + nos);
  
  }
 }

 class Hexagon extends Shape
 {
  Hexagon(int s)
   {
    super(s);
   }

 void numberofSides()
  {
   
    System.out.println(" Number of sides of Hexagon=" + nos);
  
  }
 }

class abstractshape
{ 
 public static void main(String args[])
 {
 Shape S;
 S = new Rectangle(4);
 S.numberofSides();
 S = new Triangle(3);
 S.numberofSides();
 S = new Hexagon(6);
 S.numberofSides();
 }
}
