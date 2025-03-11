import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {
	public static void main(String[] args) {
		Map<Integer, Person> map=new HashMap<>();
		map.put(1, new Person(24,"Sravs"));
		map.put(2, new Person(23,"Uday"));
		map.put(3, new Person(50,"Nimmi"));
		
		//for loop
		for( Entry<Integer,Person >entry:map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getAge());
			System.out.println(entry.getValue().getName());
		}
		
		//forEach loop
		map.forEach((k,v)->{
		System.out.println(k);
		System.out.println(v.getName());
		}
		);
		
				
	}

}
