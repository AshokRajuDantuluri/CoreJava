package inheritance;

public class Child extends Parent  {
	
	public void childMethod()
	{
		System.out.println("Child method executes");
	}

	public static void main(String[] args) {
		
//		Child ch = new Child();
//		ch.childMethod();
//		ch.parentMethod();
		Parent p = new Parent();
		p.parentMethod();
//		Parent p1 = new Child();
//		p1.parentMethod();
		//Child ch1 = new Parent();
	

	}

}
