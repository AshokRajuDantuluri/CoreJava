import java.util.Scanner;

public class InterviewQues {

	public static void main(String[] args) {
           
		// prime Number
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number to check whether it is prime or not");
		  int number  = sc.nextInt();
		  if(number % 2 ==0 || number % 2==1)
		  {
			  System.out.println(number + "is a prime number");
		  }
		  
		  else
		  {
			  System.out.println(number + " is not a prime number");

		  }
		  
	}

}
