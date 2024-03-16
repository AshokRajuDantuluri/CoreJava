package patterns;

public class PatternA {

	public static void main(String[] args) {
	    int length =10;
	    
	    
	    
	    for(int r=1; r<=length; r++)
	    {
	    	for(int c=1; c<=length;c++)
	    	{
	    		if((r!= 1 && (c==1 || c==length)) || r==1 && (c>1 && c<length) || r==length/2+1)
	    		    
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


