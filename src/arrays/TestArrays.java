package arrays;

public class TestArrays {

	public static void main(String[] args) {

		 int[] arr = {3, 2, 7, 6, 10, 9, 12, 14};
		 
		 int evenCount=0;
		 int oddCount=0;
		 
		 int evenSum=0;
		 int oddSum=0;
		 

		 

   
		 
		   for(int i=0; i<arr.length;i++)
		   {
			   if(arr[i]%2==0)
			   {
				   evenCount = evenCount+1;
				   evenSum = evenSum+arr[i];
				   //System.out.println("Even Numbers in the array :" +arr[i]);
			   }
			   
			   else
			   {
				   oddCount = oddCount+1;
				   oddSum= oddSum+arr[i];
				   //System.out.println("Odd Numbers in the array :" +arr[i]);
			   }
		   }
		   
			 int[] evenArray = new int[evenCount]; //5
			 
			// System.out.println(evenCount);
			 
			 int count=0;
			 
			  for(int i=0; i<arr.length;i++)
			   {
				  if(arr[i]%2==0)
				   {
					  count++;
					  for(int j=count-1; j<evenCount;j++)
					  {
					  evenArray[j] = arr [i];
					   break;
					  }
  
				   }
			   }
			  
			  for(int i=0; i<evenArray.length;i++)
			   {
			 
			        System.out.println(evenArray[i]);
			   }
			  
			  
			  
			  

			  
			  
		   
		  



	}

}
