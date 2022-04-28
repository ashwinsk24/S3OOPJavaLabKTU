import java.io.*;
import java.util.*;

class Complex
{
  int real;
  int img;

  void add(Complex b)
  { 
    real=0;
    img=0;
    real = this.real + b.real;
    img  = this.img+ b.img;
    System.out.println("Sum is Real: " + real +"  Imaginary: " + img);
   } 
  
  void difference(Complex b)
  { 
    real=0;
    img=0;
    real = this.real-b.real;
    img  = this.img-b.img;
   System.out.println("Difference is Real: "+ real +"  Imaginary: "+img);
   }


  void product(Complex j)
  {
   real=0;
   img=0;
   real=(this.real*j.real)-(this.img*j.img);
   img=(this.real*j.real)+(this.img*j.img);
   System.out.println("Product is Real: " + real +"  Imaginary: " + img);
  }
}
    
class Complexmain
{
  public static void main (String args[])
   {
     
     Scanner obj=new Scanner(System.in);
     Complex c1 = new Complex();
     Complex c2 = new Complex();
     System.out.println("Enter Real and imaginary part of 1st ");
     c1.real = obj.nextInt();
     c1.img = obj.nextInt();
     System.out.println("Enter Real and imaginary part of 2nd ");
     c2.real = obj.nextInt();
     c2.img = obj.nextInt();
     c1.add(c2);
     c1.difference(c2);
     c1.product(c2);
   }
}