package arrays;

public class ArrayProblem {

	public static void main(String[] args) {

	String [] arr = {"Ashok", "Vardhan", "Vardhan", "Ramesh", "Mahesh", "Naresh"};
	
	String[] uniqueArray= new String[arr.length];
	int j=0;
	int duplicateCount=0;
	//expectedoutput={Ashok, veera, vardhan}
	
	for(int i=0; i<arr.length-1;i++)
	{
		
			if(arr[i] != arr[i+1])
			{
			
				uniqueArray[j] = arr[i];
				         
				//System.out.print(uniqueArray[j]);
				j++;

			}
			else
			{
				duplicateCount++;
				
				//System.out.print(uniqueArray[j]);
			}
			

		
		
		
		
	}
	

	
	   for(int i=0; i<=uniqueArray.length-1;i++)
	   {
		   if(uniqueArray[i] == null) {
		   }
		   else
		   {
			   System.out.print(uniqueArray[i]);

		   }

           if(i==(uniqueArray.length-duplicateCount))
           {
        	   uniqueArray[i] = arr[arr.length-1];
        	   System.out.print(uniqueArray[i]);
           }
		  
	   }
	
	}

}
