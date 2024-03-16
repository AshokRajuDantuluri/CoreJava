package overloading;

public class Testing {
	
	public void m1(Parent p, Child c)
	{     if(p.a == c.a)
	{
		  System.out.println(p.a +"is equal to"+ c.a);
	}

	}
	
	public void m1(Child c)
	{
		System.out.println("Child Class Reference Method");
	}

	public static void main(String[] args) {
       
		  Testing t = new Testing();
		  
//		  Child ch = new Child();
//		  
		  Parent pa = new Parent();
		  Child ch = new Child();
  
		     t.m1(pa, ch);
		     
//		       t.m1(ch);
//		       
//		 Parent pa1 = new Child();
//		        t.m1(pa1);
	}

}
