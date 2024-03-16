package arrays;

import java.io.FileNotFoundException;

public class Ashok {

	public static void main(String[] args)   {	
		
		MyThread t = new MyThread();
		t.setPriority(10);
		t.start();
		for(int i=0; i<5; i++)
		{
			System.out.println("Main Thread");
		}
		
	  }
		  
	}


class MyThread extends Thread
{
	public void run() {
              
		for(int i=0; i<5; i++)
		{
			System.out.println("Child Thread");
		}
	}
      
}


