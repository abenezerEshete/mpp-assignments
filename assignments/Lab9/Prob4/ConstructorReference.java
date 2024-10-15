package lesson9.lecture.streamandoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@FunctionalInterface
	public interface TriFunction<S,T,U,V>{
		V apply(S s,T t,U u);
	}
}

public class ConstructorReference {

public static void main(String args[]){

	Human[] list = { new Human("Joe",35,"Male"),
			new Human("Jane",45,"Female"),
			new Human("John",30,"Male")};
	
    // Query 1  : Print only Female candidates names
	Stream.of(list)
			.filter(x->x.getGender().equals("Female"))
			.map(Human::getName)
			.forEach(System.out::println);


    /* Query 2 : Create an object for the Type of Human class by choosing suitable Interface for the three  constructors using ClassName::new. 
                 Then print the object status */

	Function<String,Human> exp1 = Human::new;
	BiFunction<String,Integer,Human>  exp2 = Human::new;
	Human.TriFunction<String,Integer,String,Human> exp3 = Human::new;

	System.out.println(exp1.apply("Sandra"));
	System.out.println(exp2.apply("Hewitt",23));
	System.out.println(exp3.apply("Abenezer",30,"Male"));

	// Query 3 : Count the male candidates whose age is more than 30
	Long countMale = Stream.of(list)
								.filter(x->x.getAge()>30)
								.filter(x->x.getGender().equals("Male"))
								.count();
	System.out.println(countMale);
   }

}
