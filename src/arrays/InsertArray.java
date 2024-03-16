package arrays;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] arr = {10,20,30,40,50,60,70,80};
		
		int[] arr1 = new int[arr.length+1];
		
		int arr1length = arr1.length;
		
		int elementposistion = 4;
		
		int element = 100;
		
		for(int i=0; i<arr1length-1;i++)
		{
			arr1[i]=arr[i];
		}
		
		for(int i=0; i<=arr1length-1;i++)
		{
			arr1[arr1length-1]=0;
		}
		
		for(int i=arr1length-1; i>elementposistion;i--)
		{
			  arr1[i] = arr1[i-1];
		}
		  arr1[elementposistion] = element;
		for(int i=0; i<=arr1length-1;i++)
		{
			System.out.print(" " +arr1[i]);
		}

	}
}
