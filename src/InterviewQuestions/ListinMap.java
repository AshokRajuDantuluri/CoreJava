package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;

public class ListinMap {

	public static void main(String[] args) {
       
		List<String> names = new LinkedList<String>();
		names.add("Ashok");
		names.add("Ramesh");
		List<String> roles = new LinkedList<String>();
		roles.add("Tester");
		roles.add("Developer");
		HashMap<String, List> map = new HashMap<String, List>();
		map.put("employeeNames", names);
		map.put("designation", roles);
		
		     //Iterator<String> itr = map.keySet().iterator();
		     for(String key : map.keySet())
		     {
		    	 System.out.println(key);
		    	 for(List value:map.values())
		    	 {
		    		   System.out.println(value);
		    	 }
		    	 


		     }

		

		
	}

}
