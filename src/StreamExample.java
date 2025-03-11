import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Stream<Integer> stream1=Stream.of(9,1,3,4,6,7,8);
		//count
		System.out.println(stream1.count());//7
		//min
		Integer min=Stream.of(9,1,3,4,6,7,8).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);//1
		//max
		Integer max=Stream.of(9,1,3,4,6,7,8).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);//9
		
	}

}