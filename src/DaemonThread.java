
public class DaemonThread {

	public static void main(String[] args) {
          
		
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();
		System.out.println("Main Thread");

	}

}

class MyThread extends Thread
{
	
    public void run()
    {
    	for(int i=0; i<100; i++)
    	{
    		System.out.println("Child Thread");
    	}
    }

}

