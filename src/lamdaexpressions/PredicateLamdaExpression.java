package lamdaexpressions;

import java.util.function.Predicate;

public class PredicateLamdaExpression {

	public static void main(String[] args) {
        
		
		//predicate interface contans test();
		// predicate interface lamdaexpresson is used for appliyng conditions
		// returns boolean value
		//accepts any type of paramter 
		
		Predicate<String> p = s-> (s.length()>5);
		System.out.println(p.test("Ashoks"));
		
	}

}
