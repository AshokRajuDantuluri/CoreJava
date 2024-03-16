
public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		
		UpdateSenderThread ust = new UpdateSenderThread();
		synchronized (ust)
		{
		ust.start(); // Main
		System.out.println("Main Thread calls wait method and waiting for update from UpdateSenderThread");
		ust.wait(1000);
		System.out.println("Main Thread receives notification of totalMarksScored From UpdateSenderThread ");
		System.out.println(ust.totalMarksScored); //Main
		}//Main
		
	}

}

class UpdateSenderThread extends Thread
{
	
    int totalMarksScored=0; // Main
    
    public void run() {
    	
   
  synchronized (this)
  {
  	System.out.println("UpdateSenderThread  Executing to Provide an Update to Main Thread ..... Please hold a second");

    for(int i=1; i<=10; i++)
    {
    	totalMarksScored = totalMarksScored+i;
    }    	
        System.out.println("UpdateSenderThread Provided Update to Main Thread");

       this.notify(); // child
    
    }
    }

}
