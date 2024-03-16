
public class DeadLock extends Thread {
	
	A a = new A();
	B b= new B();
	
	public void m1()    // main
	{
		this.start(); //main
		a.d1(b); //main  // b class object lock
	}
	
	public void run()  // child
	{
		b.d2(a); // child   // a class object
	}


	public static void main(String[] args)
	{
		
		
		DeadLock dl = new DeadLock(); // main
		dl.m1(); // main
		
	}
}


class A
{
	
	public synchronized  void d1(B b)
	{
		
		System.out.println("Main Thread starts execution d1 method");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Main Thread  trying to call class B last method");
		b.last(); // A lock

	}
	
	   public synchronized  void last()
	   {
		   System.out.println("Inside A Last Method");   // Main  A lock
	   }

}

class B
{
	
	public synchronized  void d2(A a)  // child
	{
	System.out.println("Child Thread starts execution d2 method");
	try
	{
		Thread.sleep(5000);
	}
	catch(InterruptedException e)
	{
		
	}
	System.out.println("Child Thread trying to call class A last method");
	a.last(); // Block
}
   public   void last()
   {
	   System.out.println("Inside B Last Method");    // child     B lock
   }

}
