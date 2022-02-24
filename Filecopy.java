import java.io.*;
import java.util.*;

class Filecopy
{
  public static void main( String args[] ) throws IOException, FileNotFoundException
  { 
    FileReader in = null;
    FileWriter out = null;
    
   try
     {
      in = new FileReader("enteredtext.txt");
      out = new FileWriter("copiedtext.txt");
      int c;
      while(( c = in.read())!= -1)   // returns -1 at EOF while reading
           { out.write(c);
           } 
       System.out.println("File Copied "); 
     }
      
   finally
        {
          if(in != null)
             in.close();                               
          
          if(out != null)
             out.close();
       }
  }
}                              

