package lamdaexpressions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lamdaexpressions.Employee;

public class StreamsDemo {

	public static void main(String[] args) {
           
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> bigNames = new ArrayList<String>();

		names.add("Ashok");
		names.add("Vardhan");
		names.add("Veerababu");
		names.add("B");
		names.add("Joy");
		
//		  for(String name: names)
//		  {
//			  if(name.length()>5)
//			  {
//				  bigNames.add(name);
//				  
//			  }
//			  
//		  }
//
//		   System.out.println(bigNames);
		
	List<String> bigName =	names.stream().filter(name-> name.length()>5).collect(Collectors.toList());
      bigNames.addAll(bigName);
      System.out.println(bigNames);
}
}