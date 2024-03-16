package arrays;

public class DeleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,30,50,60,70,80};
		
		int [] arr1;
		
		int delEle = 30;
		
		int count =0;

		
		   for(int i=0; i<arr.length;i++)
		   {
			   			   
			   if(delEle == arr[i])
			   {
				 
				   count = count+1;
				   System.out.println(count);
				   
				   for(int j=i; j<arr.length-1;j++)
				   {
					   arr[j] = arr[j+1]; 
					   
				   }
				   
				   //break;
				   
				   
		   }
		   
		   }
			   
		     for(int i=0; i<arr.length-2;i++)
		     {
		    	 System.out.print(arr[i] + " ");
		     }
		

	}

}
