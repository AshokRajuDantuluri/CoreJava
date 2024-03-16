package lamdaexpressions;

import java.util.function.Function;

public class FunctionalLamdaExpression {

	public static void main(String[] args) {
        
		//function interface contans apply();
		// function interface lamdaexpresson is used for performing an operations
		// based on input value and it throws an output
		// accepts anytype of input and gives any type of ouput
		
		Function<String, String> f = s -> s.concat(" ");
		System.out.println(f.apply("Ashok"));
		
		// Function chain
		
		Function<Integer, Integer> f1 = i -> i*2;
		Function<Integer, Integer> f2 = i -> i*i*i;
		
		System.out.println(f1.andThen(f2).apply(2));
		
		System.out.println(f1.compose(f2).apply(2));



		
		
	}

}
