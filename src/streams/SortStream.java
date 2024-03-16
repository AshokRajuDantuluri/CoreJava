package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortStream {

	public static void main(String[] args) {
          
		List<Integer> list = Arrays.asList(2,5,7,9,8,5,4);
		
	Optional<Integer> miniumValue =	list.stream().min((minValue,maxValue) -> {
			return minValue.compareTo(maxValue);
		});
	
	      System.out.println(miniumValue.get());
	      
	      Optional<Integer> MaxValue =	list.stream().max((minValue,maxValue) -> {
				return minValue.compareTo(maxValue);
			});
		
		      System.out.println(MaxValue.get());
		      
		      
	List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList);
	
	List<Integer> reversesortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(reversesortedList);
	}
	
	
	

      

}
