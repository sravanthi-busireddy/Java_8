import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetForEachExample {
	Set<Person> set=new HashSet<>();
	public static void main(String[] args) {
		Set<Person> set=new HashSet<>();
		set.add(new Person(24,"Sravs"));
		set.add(new Person(23,"Uday"));
		set.add(new Person(50,"Nimmi"));
		
		//for method
		for(Person person:set) {
			System.out.println(person.getAge());
			System.out.println(person.getName());
		}
		
		//forEach method
		set.forEach(person->
		{
		System.out.println(person.getAge());
		System.out.println(person.getName());
		});
		
		//forEach method for Streams
		set.stream().forEach(person->
		{
		System.out.println(person.getAge());
		System.out.println(person.getName());
		});
	}
	

}
