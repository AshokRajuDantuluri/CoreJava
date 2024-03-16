package patterns;

public class PatternB {

	public static void main(String[] args) {
       
		 int length = 11;
		 
		 for(int r= 1; r<=length; r++)
		 {
			 for(int c = 1; c<=length; c++)
			 {
				 if(((r==1 && c<length-1)  || (r==length/2+1 && c<length-1)  || (r==length && c<length-1 ))
				    ||(r<=length && c==1)
			        || c==length && (r!=length/2+1 && r!=1 && r!=length))
					 
				 {
				 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 
			 System.out.println();
		 }
	}

}
