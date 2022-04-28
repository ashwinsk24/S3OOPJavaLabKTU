// Write a Java Program to find the frequency of a given character in a string.

import java.io.*;
import java.util.*;

class frequency_of_characters{
public static void main(String args[]){
  String str;
  Scanner ob = new Scanner(System.in);
  System.out.println(" Enter string: ");
  str = ob.nextLine();
  int[] freq = new int[str.length()];
  int i,j;
  char string[] = str.toCharArray();
  for(i = 0; i<str.length(); i++){
      freq[i]=1;
     for(j=i+1; j<str.length(); j++){
         if(string[i] == string[j]){
            freq[i]++;
           string[j] = '0';
           }
         }
      }
  System.out.println(" Characters and frequency: ");
  for(i = 0; i < str.length(); i++){
      if(string[i]!= ' ' && string[i]!= '0')
             System.out.println(" "+string[i]+ "-" + freq[i]);
   }
  }
}
    