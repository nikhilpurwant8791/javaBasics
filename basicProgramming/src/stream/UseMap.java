package stream;

import java.util.*;
import java.util.stream.Collectors;

public class UseMap {
	/*
	 * Map is used to transform the element of stream
	 */
	public static void main(String[] args) {
		List<String> li = useCollection();
		System.out.println(li);
		for(String name:li)  {
			System.out.println(name);  
		}
		System.out.println("-----*****------");
		useForEach();
	}
	public static List<String> useCollection() {
		List <String> l = new ArrayList<String>();
		l.add("Nikhil");
		l.add("Max");
		l.add("Mayur");

		List<String> li = l.stream().filter(s -> s.startsWith("M")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		return li;
	}
	public static void useForEach() {
		List <String> l = new ArrayList<String>();
		l.add("Nikhil");
		l.add("Max");
		l.add("Mayur");
		l.add("Nishant");

		l.stream().filter(s -> s.startsWith("N")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
	}

}
