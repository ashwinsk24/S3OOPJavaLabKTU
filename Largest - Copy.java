import java.io.*;
import java.util.*;

class Largest
{ 
  public static void main(String[] args)
  {
    int A[] = new int[10][10];
    int B[] = new int[10][10];
    int C[] = new int[10][10];
    int i,j,k,r1,c1,r2,c2;
    Scanner ob= new Scanner(System.in);
    System.out.println(" Enter the no. of rows and columns of 1st matrix ");
    int r1 = ob.nextInt();
    int c1 = ob.nextInt();
    System.out.println(" Enter the no. of rows and columns of 2nd matrix ");
    int r2 = ob.nextInt();
    int c2 = ob.nextInt();
    if(c1 == r2){
    System.out.println(" Enter the elements of 1st matrix: ");
    for(i=0; i<r1; i++){
       for(j=0 ; j<c1; j++){
        A[i][j]= ob.nextInt();
        }
      }
    System.out.println(" Enter the elements of 2nd matrix: ");
    for(i=0; i<r2; i++){
       for(j=0 ; j<c2; j++){
        B[i][j]= ob.nextInt();
        }
      }
    System.out.println(" Product: ");
    for(i=0; i<r1; i++){
        for(j=0; j<c2 ; j++){
            C[i][j]=0;
            for(k=0 ; k<c1;k++){
            C[i][j] = C[i][j] + A[i][k]*B[k][j];
            }
        System.out.println(C[i][j]+" ");
      }
      System.out.println);
    }
  }
 }
}
