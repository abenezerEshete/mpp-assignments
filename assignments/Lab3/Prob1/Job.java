package Inheritance.example;

public class Job {
	private Person person;  // Composition: PersonWithJob has a Person
	private double salary;
	
	// Constructor
	Job(String name, double salary) {
		this.person = new Person(name);  // Create a Person object inside
		this.salary = salary;
	}
	
	// Getter for salary
	public double getSalary() {
		return salary;
	}
	
	// Getter for the person's name
	public String getName() {
		return person.getName();
	}
	
	// Override equals to compare both name and salary
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false; 
		if (!(obj instanceof Job)) return false;
		Job other = (Job) obj;
		return this.person.equals(other.person) && this.salary == other.salary;
	}
	
	public static void main(String[] args) {
		Job p1 = new Job("Joe", 30000);
		Person p2 = new Person("Joe");
		
		// Now using composition, we compare correctly
		System.out.println("p1.equals(p2)? " + p1.equals(p2));  // false
		System.out.println("p2.equals(p1)? " + p2.equals(p1));  // true
	}
}
