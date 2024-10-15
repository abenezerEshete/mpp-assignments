package lesson10.generics.labsolution.prob2;

import java.util.Objects;

public class Person  {
	String name;
	public Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o){
		if(o==null) return false;
		if(!(o instanceof Person)) return false;
		return Objects.equals(((Person) o).getName(), this.getName());
	}

}
