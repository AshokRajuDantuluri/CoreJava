package Strings;

 public class Test {
	

	public static void main(String[] args) {
          

        // reverse a string in java
		
		// veerababu    --->    ubabareev
		
		// revese each  sentence   
		
		// veerababu    vardhan     
		
		
		String s = "veerababu vardhan"; 
		
		String reverseWord = "";

		
		String output="";
		
		String [] words = s.split(" ");
		
		
		for(String word : words) {
			
		
			for(int i = word.length()-1; i>=0; i-- )
			{
				reverseWord = reverseWord+word.charAt(i);
			}
			
			   output = output+reverseWord+" ";
			   
		}
		
		   System.out.println(output);

		
		

		
		
		
		
		
		
		
		  
             
	}

}
