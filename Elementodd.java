import java.io.*;
import java.util.*;
 public class Elementodd
 {
     public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
         int[] A=new int[10];
         System.out.println("Enter number of elements in the list : ");
         Scanner ob=new Scanner(System.in);
         int n=ob.nextInt();
         System.out.println("Enter the elements : ");
         for(int i=0;i<n;i++)
         {
             A[i]=ob.nextInt();
             list.add(A[i]);
         }
         System.out.println("The list is "+list);
         System.out.println("Enter value of n : ");
         int number=ob.nextInt();
         Elementodd obj = new Elementodd();
         int c = obj.getElement(list,number);
         System.out.println(c);
     }

      public Integer getElement(List<Integer> list, Integer n) {
        int elementIndex = 2 * (n-1);
        if(elementIndex > list.size() - 1)
        return -1 ;
        else
        return list.get(elementIndex);
    }
 }
