public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Display d = new Display();      
		MyThread1 mot1 = new MyThread1(d);
		MyThread1 mot2 = new MyThread1(d);

		mot1.start();
		mot2.start();
	}

}

class Display
{
	
   public static void numbers() //
   {
	   
	   for(int i=0;i<1;i++)
	   {
		   System.out.println(Thread.currentThread().getName());
		   try
		   {
			   Thread.sleep(2000);
		   }
		   catch(InterruptedException e)
		   {
			   
		   }
		   
	   }
	   
	   synchronized(Display.class) {
	   
	   for(int i=1; i<=10; i++)
	   {
		    System.out.print(i);
	    
	   try
	   {
		   Thread.sleep(2000);
	   }
	   catch(InterruptedException e)
	   {
		   
	   }
	   
	   }
	   }
   }
	   


   }
   
   
   

  class MyThread1 extends Thread
  {
	  
	   Display s;
	   
	   MyThread1(Display s)
	   {
		   this.s=s;
	   }
	   
	   
	   public  void run()
	   {
		   s.numbers();
	   }
	    
  }
  
  
  
 