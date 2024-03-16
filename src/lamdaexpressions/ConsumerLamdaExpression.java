package lamdaexpressions;

import java.util.function.Consumer;

public class ConsumerLamdaExpression {

	public static void main(String[] args) {
        
		
		Consumer<String> c = i->System.out.println(i);
		c.accept("Ashok");
	}

}
