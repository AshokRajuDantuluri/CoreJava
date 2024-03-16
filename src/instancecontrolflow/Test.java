package instancecontrolflow;

public class Test {
	
	 int i = 10; //ins 1 ==0 -->10
	 { //ins2
		 m1();
		 System.out.println("Instance Block"); // op2
	 }
	 
	 Test() //ins3
	 {
		 System.out.println("Test Constructor"); //op3
	 }

	public static void main(String[] args) {   //1
		
		Test t = new Test();
		System.out.println("Main Method"); //op4
	}
	
	public void m1()
	{
		System.out.println(j); //op1==0
	}
	int j = 20; //ins4 ==0
	//veerababu && Vardhan                                            
	//0
	//instance Block
	//Test constructor
	//main method

}
