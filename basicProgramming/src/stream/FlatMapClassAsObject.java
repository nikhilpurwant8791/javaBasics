package stream;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapClassAsObject {
	//	Note: flatMap()return the stream of object

	public static List<String> employee () {
		//Create list of employee and use class as object
		List<UseThisClassAsObject> eList = new ArrayList<UseThisClassAsObject>();
		eList.add(new UseThisClassAsObject("Nikhil", 101, 20000));
		eList.add(new UseThisClassAsObject("Mayur", 102, 30000));
		eList.add(new UseThisClassAsObject("Spruha", 103, 40000));
		eList.add(new UseThisClassAsObject("Ananya", 104, 50000));
		eList.add(new UseThisClassAsObject("Pooja", 105, 60000));
		eList.add(new UseThisClassAsObject("Ambika", 106, 70000));

		List<UseThisClassAsObject> eListDetails = new ArrayList<UseThisClassAsObject>();
		eListDetails.add(new UseThisClassAsObject("Pune", 123456789));
		eListDetails.add(new UseThisClassAsObject("Badami", 123456789));
		eListDetails.add(new UseThisClassAsObject("Hampi", 123456789));
		eListDetails.add(new UseThisClassAsObject("Satara", 123456789));
		eListDetails.add(new UseThisClassAsObject("Vijaywada", 123456789));
		eListDetails.add(new UseThisClassAsObject("Hyderabad", 123456789));

		// Combine emloyee list
		List<List<UseThisClassAsObject>> commonList = Arrays.asList(eList,eListDetails);

		//Use Stream function to combine and create final list
		//		List<UseThisClassAsObject> finalresult = new ArrayList<UseThisClassAsObject>();
		List<String> finalresult = commonList
				.stream()
				.flatMap(e -> e.stream()
						.filter(s -> s.salary>40000)
						.map(emp -> emp.name))
				.collect(Collectors.toList());
		return finalresult;
	}

	public static void main (String[] args) {
		System.out.println(""+employee());
	}
}
