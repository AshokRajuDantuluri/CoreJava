package staticcontrolflow;

public class Child extends Parent {
	
	  static int x = 100; //6  value =0-->100
	  
	  static //7
	  {
		  m2();
		  System.out.println("Derived First Static Block");//op4
	  }

	public static void main(String[] args) { //8
          
		   m2();
		   System.out.println("Child Main Method"); //op7
	}
	
	public static void m2() //9
	{
		  System.out.println(y); //op3 ==0 && op6==200
	}
	
	static //10
	{
		System.out.println("Derived Second Static Block"); //op5
	}
	
	static int y = 200;//11 value = 200

}
