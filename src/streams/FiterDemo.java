package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiterDemo {

	public static void main(String[] args) {
        
		List<Integer> numberList = Arrays.asList(10,15,20,25,30,35,40);
		List<Integer> evennumberList = new ArrayList<Integer>();
		
//		for(int i:numberList)
//		{  
//			if(i%2==0)
//			evennumberList.add(i);
//		}
		
		
//		evennumberList =numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(evennumberList);
		
//		numberList.stream().filter(n->n%2==0).forEach(a-> System.out.println(a));
		numberList.stream().filter(n->n%2==0).forEach(System.out::println);



	}
	

}
