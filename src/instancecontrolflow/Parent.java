package instancecontrolflow;

public class Parent {
	
	int x=10;  // instance 1 == 10
	{// instance 2
		m1();
		System.out.println("Parent Instance Block"); //op2
	}
	
	Parent()// instance 3
	{
		System.out.println("Parent Constructor"); //op3
	}

	public static void main(String[] args) {  //1
        
		Parent p = new Parent();
		System.out.println("Parent Main Method");
	}
	
	public void m1()
	{
		System.out.println(j); // op1
	}
	
	int j = 20;// instance 4
	

}
