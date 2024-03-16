import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Palindrome {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();

		l.add("Monday");

		l.add("Monday");

		l.add("Monday");

		l.add("Tuesday");

		l.add("Tuesday");

		l.add("Wednasday");

		
		HashMap<String, Integer> Hm = new HashMap<String, Integer>();

		for(int i=0;i<l.size();i++) {

             if(Hm.containsKey(l.get(i)))
            	 
             {
            	 Hm.put(l.get(i).toString(), Hm.get(l.get(i))+1);
             }
             
             else
            	 
             {
            	 Hm.put(l.get(i).toString(), 1);
             }

		}
		
		
		     Set words =  Hm.keySet();
		     
		     for(Object word : words)
		     {
		    	 if(Hm.get(word) >= 1 )
		    	 {
		    		 System.out.println(word + " is available in the Arraylist :- " + Hm.get(word) + "times" );
		    	 }
		     }
		    
	}
	

}
