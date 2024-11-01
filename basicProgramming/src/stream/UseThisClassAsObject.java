package stream;

public class UseThisClassAsObject {
//	use class as object
	String name;
	int id;
	int salary;
	String address;
	int phoneno;
	
	UseThisClassAsObject(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	UseThisClassAsObject(String address, int phoneno){
	this.address = address;
	this.phoneno = phoneno;
	}

}
