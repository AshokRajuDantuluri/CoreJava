package overloading;

public class MethodSignature  {
	
       public void m1(int x) // child class reference
	    {
	    	System.out.println("Single parameter");
	    }
	    
	    public void m1(int ...x) // child class reference
	    {
	    	System.out.println("Multiple Parameter");
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		MethodSignature ms = new MethodSignature();
              ms.m1();
		
		     
		  
		   
	}

}
