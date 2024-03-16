package staticcontrolflow;

public class Parent {
	
	static int x=10; //1 value==0
	
	static //2
	{
		m1();
		System.out.println("Parent Static Block");//op2 = psb
	}
	
	public static void main(String[] args) //3 //Not execute
	{
		m1();
		System.out.println("Main Method");
	}
	
	public static void m1() //4
	{
		System.out.println(j);  // op1=0
	}
	
	static int j = 20;//5 value = 0
	

	

}
