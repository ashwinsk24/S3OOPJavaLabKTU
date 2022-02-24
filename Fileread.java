import java.io.*;

public class Fileread
{
  public static void main (String[] args) throws FileNotFoundException,IOException
  {
  BufferedReader br = null;
  BufferedReader br1 = null;
  String strLine = " ";
  int i,ch=0,w=0,j;
  String words;
  
  try
  {
 	br = new BufferedReader(new FileReader("enteredtext.txt"));
	for(i=1;(strLine = br.readLine())!=null;i++)
	{
	  System.out.println(i+") " + strLine);
	  ch+=strLine.length();
          String line = strLine;
	  int n=line.length();	  
	  for(j=0;j<n;j++)
		if(line.charAt(j)==' ')
		    w++;
	  w++;
	}
	System.out.println();
	System.out.println("Number of characters: " + ch);
	System.out.println("Number of words: " + w);
	System.out.println("Number of lines: " + (i-1));
	br.close();
    }
  
  catch(FileNotFoundException e)
	{
	System.err.println("File not found.");
	}
  catch(IOException e)
	{
	System.err.println("Unable to read the file.");
	}
  }
}