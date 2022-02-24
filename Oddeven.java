import java.io.*;
public class Oddeven
{
public static void main (String[] args) throws FileNotFoundException,IOException
{
  FileWriter oute = null;
  FileReader inp;
  FileWriter outo = null;
  try
  {
	outo = new FileWriter("oddnew.txt");
	oute = new FileWriter("evennew.txt");
	inp = new FileReader("samplen.txt");
	int c;
	while((c=inp.read())!=-1)
	{
	  if ((c-48)%2==0)
		oute.write(c);
	  else
		outo.write(c);
	}
	System.out.println("The numbers have been sorted.");
	oute.close();
	outo.close();
	inp.close();
  }
  catch(Exception e)
	{
	System.err.println(e);
	}
}
}