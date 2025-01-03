package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {


		List<Employee> employees = new ArrayList<Employee>();
		
		employees = Arrays.asList(
				new Employee(1,"rakesh",2300),
				new Employee(2,"resh",2300),
				new Employee(3,"rak",2300),
				new Employee(4,"raj",2300)
				
				);
		
		employees.stream().map((obj) -> obj.salary).reduce(0.0,(a,b) ->a+b);
		
		employees.stream().filter((obj) ->{
			if(obj.name.charAt(0) == 'R' && obj.name.charAt(1) == 'a')
				return true;
			else
				return false;
		}).collect(Collectors.toList());
		
		employees.stream().filter(obj -> obj.salary > 2000 ? true : false).collect(Collectors.toList()));	
			
		
	}

}
