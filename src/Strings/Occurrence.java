package Strings;

public class Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String s = "avardhvn";
		 
		 int [] arr = new int[127];
		 
		     for(int i=0; i<s.length()-1;i++)
		     {
		    	arr[s.charAt(i)] = arr[s.charAt(i)]+1;
		    	//  118             = 1
		    	//  97              = 1
		    	//  76              =1
		    	//   89             =1
		    	//   99             =1
		    	//   97              =2
		    	//   122             =1

		     }
		     
		     int max = -1;    
		     
		     char c= ' ';
		     
		     for(int i=0; i<s.length()-1;i++)
		     {
		    	 if(max < arr[s.charAt(i)])   
		    		 
		    	 {
		    		 max = arr[s.charAt(i)]; 
		    		 c = s.charAt(i); 
		    	 }
		     }
		     
		      System.out.println("Number of times value repeated :" + max);
		      
		      System.out.println("Repeated Character :"+ c);
		     
		     
		 
		 
	  
				                  
	
		
		
		
	}

}
