package instancecontrolflow;

public class Child extends Parent {

	int x=70;// instance 5 ==70
	{// instance 6
		m1();
		System.out.println("Child Instance Block"); //op5
	}
	
	Child()// instance 7
	{
		System.out.println("Child Constructor"); //op7
	}

	public static void main(String[] args) { //2
        
		Child c = new Child();
		System.out.println("Child Main Method"); //op8
	}
	
	public void m1()
	{
		System.out.println(j); //op4
	}
	{// instance 8
		System.out.println("Child second Instance Block"); //op6
	}
	
	int j = 20;// instance 9


	}


