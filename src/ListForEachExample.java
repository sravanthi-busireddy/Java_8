import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {
	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		list.add(new Person(24,"Sravanthi"));
		list.add(new Person(23,"Uday"));
		list.add(new Person(50,"Nimmi"));
		
		// for loop
		for(Person person: list) {
			System.out.println(person.getAge());
			System.out.println(person.getName());	
		}
		
		//forEach loop
		list.forEach(person->
		{
			System.out.println(person.getAge());
			System.out.println(person.getName());
		});
		//forEach loop using stream
		list.stream().forEach(person->
		{
			System.out.println(person.getAge());
			System.out.println(person.getName());
		});
	}		
	}

class Person{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
