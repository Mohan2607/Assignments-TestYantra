package com.tyss.stream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "Harish", "HR", 100000),
				new Employee(2, "mohan", "HR", 400000),
				new Employee(3, "hgs", "kfd", 34500),
				new Employee(4, "madhavan", "tester", 40000000));
		
		//Collections.sort(asList);
		
		Stream<Employee> stream = asList.stream();
		
		Comparator<Employee> com=(o1,o2)->{
			return (int)(o1.getSalary()-o2.getSalary());
		};
		
		Optional<Employee> max2 = stream.max(com);
		System.out.println(max2);
		
		asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);	
		
	}

}
