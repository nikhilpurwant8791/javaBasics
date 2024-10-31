package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFunction {
	// Map is use to transform the object
	String employeeName;
	int employeeId;
	int employeeSalary;

	MapFunction(){

	}

	MapFunction(String employeeName, int employeeId, int employeeSalary){
		this.employeeName = employeeName;
		this.employeeId=employeeId;
		this.employeeSalary=employeeSalary;
	}

	public List<String> filterWithMapMethod() {
		/*
		 * 1. Created the collector to add the employee details
		 * 2. create ArrayList by Adding all details
		 * 3. Apply filter and map function
		 * 4. store the filterd name in another list
		 * 5. Print 
		 */
		List <MapFunction> employeeList = new ArrayList<MapFunction>();
		employeeList.add(new MapFunction("Nikhil", 101, 20000));
		employeeList.add(new MapFunction("Mayur", 102, 30000));
		employeeList.add(new MapFunction("Spruha", 103, 40000));
		employeeList.add(new MapFunction("Ananya", 104, 50000));
		employeeList.add(new MapFunction("Rohit", 105, 60000));
		employeeList.add(new MapFunction("Unknown", 106, 70000));

		List<String> eName = new ArrayList<String>();
		eName = employeeList.stream().filter(e -> e.employeeSalary>50000).map(e -> e.employeeName).collect(Collectors.toList());
		return eName;
	}

	public static List<String> transformNamesToUpperCase() {
		List <String> names = Arrays.asList("nikhil", "mayur", "pooja", "spruha");
		//convert all names to uppercase
		List <String> upperCaseName= new ArrayList<String>();
		upperCaseName = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		return upperCaseName;
	}

	public static void main (String[] args) {
		MapFunction employee = new MapFunction();
		System.out.println("Print Names in UpperCase = " + transformNamesToUpperCase());
		System.out.println("Print only Employee Names = " + employee.filterWithMapMethod());
	}

}
