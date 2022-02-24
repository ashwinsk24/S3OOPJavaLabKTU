import java.io.*;
import java.util.*;

class Binarysearch
{
    public static void main(String[] args) 
    {
      int i,j,n,x;
      String temp;
      Scanner ob = new Scanner(System.in);
      System.out.print(" Enter number of elements:");
      n = ob.nextInt();
      int ar[] = new int[10];
      Scanner obj = new Scanner(System.in);
      System.out.println(" Enter the elements in ascending order: ");
        for(i = 0; i < n; i++)
        {
            ar[i] = obj.nextInt();
        }
        System.out.print("Elements: ");
        for(i = 0; i < n; i++)
        {
            System.out.print(ar[i]+" ");
        }
        
        System.out.println(" \nEnter the Element to be Searched: ");
        x = ob.nextInt();
       
        int l=0,h=n-1,mid=(l+h)/2,c=0;
       
        while(l<=h)
        {
          mid=(l+h)/2;
          
          if(ar[mid]==x)
          {
           int p = mid;
           System.out.println(" Search Success. Element "+x+" found at "+(p+1));
           c++;
           break;
          }
          else
             {
              if(ar[mid]>x)
               {
                 h=mid-1;
               }
              else
                 l=mid+1;
             }
         }   
         if(c==0)
         {
           System.out.println(" Search Failed. Element NOT found ");
         }
                        
        
    }
}                    
