package lamdaexpressions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierLamdaExpression {

	public static void main(String[] args) {
            
		Supplier<Date> s = ()-> new Date();
		System.out.println(s.get());
	}

}
