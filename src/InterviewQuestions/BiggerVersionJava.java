package InterviewQuestions;

public class BiggerVersionJava {

	public static void main(String[] args) {
        
		String s1 = "java.123";
		String s2 = "java.234";
		
		int value = s1.compareTo(s2);
		
		if(value==1)
		{
			System.out.println("String " +s1+ " is greater");
		}
		else if(value==-1)
		{
			System.out.println("String " +s2+ " is greater");
		}
		else if(value==0)
		{
			System.out.println("Both Strings are equal");
		}

	}

}
