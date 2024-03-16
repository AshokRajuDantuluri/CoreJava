package arrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
      // 1 and self
	  // remainder=0
	  // number > 0;
		
		int number = 7;
		int count =0;
		
		if(number>0)
		{
			for(int i=1; i<=number;i++)
			{
				if(number%i==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println(number +":is a prime number");
			}
			
			else
			{
				System.out.println(number +":is not a prime number");

			}
			
		}
		
		else
		{
			System.out.println(number +":is not a prime number");

		}


	}

}
