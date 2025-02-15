import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {
	public static void main(String[] args) {
		//create a stream
		Stream<String> stream1= Stream.of("a","b","c");
		stream1.forEach(System.out::println);
		
		//create a stream from sources
		Collection<String> collection=Arrays.asList("JAVA","PYTHON","C++");
		Stream<String> stream2=collection.stream();
		stream2.forEach(System.out::println);
		
		List<String> list=Arrays.asList("JAVA","PYTHON","C++");
		Stream<String> stream3=list.stream();
		stream3.forEach(System.out::println);
		
		Set<String> set=new HashSet<>(list);
		Stream<String> stream4=set.stream();
		stream4.forEach(System.out::println);
		
		String[] strArray= {"a","b","c"};
		Stream<String> stream5=Arrays.stream(strArray);
		stream5.forEach(System.out::println);
		
	}	
}
