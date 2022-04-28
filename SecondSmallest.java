import java.io.*;
import java.util.*;

class SecondSmallest
{ 
  public static void main(String[] args)
  {
    System.out.println("Enter the no. of elements ");
    int A[] = new int[10];
    Scanner ob= new Scanner(System.in);
    int n = ob.nextInt();
    int i;
    System.out.println(" Enter the elements ");
    for(i=0; i<n; i++){
       A[i]= ob.nextInt();
      }
    int small=9999; 
    int secsmall=9999;
     for(i=0; i<n; i++){
     if(A[i]<small){
       secsmall = small;
       small = A[i];
      }
     else if((A[i]<secsmall) && (A[i] != small)){
       secsmall = A[i];
     }
   }
    System.out.println("Second Smallest element " +secsmall );
  }
}
