
public class InterThreadComm {

	public static void main(String[] args) throws InterruptedException {

		myOwnThread mot = new myOwnThread();
		mot.start();
		synchronized (mot)
		{
		System.out.println("Main Thread calling wait method and waiting for notification");
		mot.wait();
		System.out.println("Main Thread got notification from child thread");
		System.out.println(mot.total);
		}
		
	}

}

class myOwnThread extends Thread
{
	
	int total =0;
	
	
	
public void run()
{
	
	synchronized (this)
	{
	System.out.println("Child Thread starts calculation");
   for(int i=1; i<=100;i++)
   {
	   
	    total = total+i; 
   }
	System.out.println("Child Thread gives notification");
   this.notify();
	}
   //System.out.println(total);

}



}