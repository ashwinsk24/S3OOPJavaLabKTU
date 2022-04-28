import java.io.*;
import java.util.*;

class Largest
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
     int max = A[0];
     for(i=1; i<n; i++){
     if(A[i]>max){
       max = A[i];
      }
     }
    System.out.println("Largest element " +max );
  }
}
