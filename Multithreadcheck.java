import java.io.*;
import java.util.Random;

class RandomNumThread extends Thread
{
      public void run()
      {
      Random random = new Random();
      int i;
      for(i=0;i<10;i++)
        {
           int rndmno = random.nextInt(30);
           System.out.println(" Random No: "+ rndmno);
           if( rndmno%2 == 0)
             {
               Squarenum sqT = new Squarenum(rndmno);
               sqT.start();
             }
           else
            {
              Cubenum cbT = new Cubenum(rndmno);
              cbT.start();
            }
            try{
             Thread.sleep(1000);
            }
            catch(Exception e){
            System.out.println(e);
           }
          
        }
      } 
}

class Squarenum extends Thread 
{
	int n;

	Squarenum(int randomn) 
        {
		n = randomn;
	}

	public void run() 
        {
            System.out.println(" Square of " + n + " = " + (n*n));
	}

}

class Cubenum extends Thread 
{
	int n;

	Cubenum(int randomn) 
        {
		n = randomn;
	}

	public void run() 
        {
	    System.out.println("Cube of " + n + " = " + n*n*n);
	}

}


public class Multithreadcheck
{
	public static void main(String args[]) 
        {
		RandomNumThread rnT = new RandomNumThread();
		rnT.start();
	}

}



