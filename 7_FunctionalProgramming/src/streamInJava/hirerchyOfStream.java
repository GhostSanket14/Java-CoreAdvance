package streamInJava;

import java.util.List;

public class hirerchyOfStream {

	
	public static void main(String[] args) {
		List<Integer> al=List.of(1,2,3,4,5,6,7,8,9);
		al.stream().filter((x)-> x>5).filter((x)-> x%2==0).forEach(System.out::println);

		// There is 1 baseStream interface. and 4 sub interfaces. int/long/doubleStream and stream<T> 
		// Just REMEMBER these and dont stress too much. Learn along the way.
		
		// Lets look at functions common in all 4. (I have separated terminal and non-terminal)
		// [Terminal]  foreach(), min(), max(), findFirst(), count(), reduce(), collect() 
		// [non-Terminal] filter(), distinct(), sorted(),   
		
		// Functions only with int/long/doubleStream
		// [Terminal] sum(), average()
		// [Non-Terminal] boxed()
		
		// Extra i saw.
		// iterate(), limit()
	}
}