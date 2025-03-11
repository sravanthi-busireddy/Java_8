import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElement {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(9,7,2,4,3);
		//find first element using streams
		Optional<Integer> findFirst= list.stream().findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		else
			System.out.println("findFirst is empty");
		//find any element using streams
		Optional<Integer> findAny=list.stream().findAny();
		if(findAny.isPresent())
			System.out.println(findAny.get());
		else
			System.out.println("findAny not found");
		
	}

}
