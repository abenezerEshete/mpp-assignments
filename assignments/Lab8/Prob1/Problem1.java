package assignments.Lab8.Prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Problem1 {

	public static void main(String[] args) {
		// To understand functions as First class citizen
		 List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		 // Task 1: Identify the suitable interface to read the input and print doubled - consumer
		IntConsumer consumer = num-> System.out.println(num*2);
		changeDouble(numbers ,consumer );// Output: 2 4 6 8 10

	
		 List<String> data = Arrays.asList("apple", "banana", "cherry");
	     //Task 2: Take input of String and transform into Upper case
		Function<String, String> transformer = s -> s.toUpperCase();
		transformStrings(data , transformer);

		 
		 // Task 3: Check the inputs of given value is divisible by 5.
		 List<Integer> inputs = Arrays.asList(10, 21, 12, 25, 33);
		 IntPredicate condition = x-> x % 5==0;
	        printIf(inputs ,condition);

	}

	public static void changeDouble(List<Integer> numbers , IntConsumer consumer) {
		//numbers.forEach(n->consumer.accept(n));
        for (Integer number : numbers) {
           consumer.accept(number);
        }
	}
	public static void transformStrings(List<String> list, Function<String,String> function) {

		//list.forEach(s->System.out.println(function.apply(s)));
		for(String s : list){
			System.out.println(function.apply(s));
		}
    }

	public static void printIf(List<Integer> numbers, IntPredicate con) {
		//numbers.forEach(number -> { if (con.test(number)) { System.out.println(number);}});
        for (Integer number : numbers) {
            if (con.test(number)) {
                System.out.println(number);
            }
        }
    }
}

