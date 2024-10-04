package Inheritance.example;

public class Person {
	private String name;
	
	// Constructor
	Person(String n) {
		name = n;
	}
	
	// Getter for name
	public String getName() {
		return name;
	}
	
	// Override equals to compare names
	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null) return false; 
		if (!(aPerson instanceof Person)) return false;
		Person p = (Person) aPerson;
		return this.name.equals(p.name);
	}
}

