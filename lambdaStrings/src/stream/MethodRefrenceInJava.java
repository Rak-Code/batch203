package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodRefrenceInJava {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		for (Integer i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("--------------");
		numbers.forEach(System.out::println);
		System.out.println("--------------");
		numbers.forEach(MethodRefrenceInJava::doubleTheNum);
	
		ArrayList<Integer> demo = new ArrayList<Integer>();
		ArrayList<Integer> demo1 = new ArrayList<Integer>();
		ArrayList<Integer> demo2 = new ArrayList<Integer>();
		
		
		for (Integer integer : numbers) {
			if(integer % 2 == 0) {
				demo2.add(integer);
			}
				
		}
		
		System.out.println(demo2);
		
		for (Integer integer : numbers) {
			demo.add(integer*2);
		}
		System.out.println(demo);
		
		
		
		int sum = 0;
		for (Integer integer : numbers) {
			sum+= integer;
		}
		System.out.println(sum);
		
		
		System.out.println("Stream...........");
		System.out.println(numbers.stream().map(eg -> eg*2).collect(Collectors.toList()));
		
		System.out.println(numbers.stream().reduce(0, (a,b) ->a+b));
		
		System.out.println(numbers.stream().filter((a) ->a%2==1 ? true : false).collect(Collectors.toList())                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        );
		
		
	}
	
	
	static void doubleTheNum(int num) {
		System.out.println(num*2); 
		
	}

}
