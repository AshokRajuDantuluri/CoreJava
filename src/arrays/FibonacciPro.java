package arrays;

public class FibonacciPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 1 2 3 5 8 13 21 34 55
		int fibonacciLength = 20;
		int number1 =0;
		int number2 =1;
		int sum =0;
		
		for(int i=2; i<fibonacciLength; i++)
		{
			sum = number1 + number2;
			System.out.print("  "+sum);
			number1 = number2;
			number2=sum;
		}

	}

}
