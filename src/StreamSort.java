import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
	public static void main(String[] args) {
		List<String> fruits= new ArrayList<String>();
		fruits.add("APPLE");
		fruits.add("PAPAYA");
		fruits.add("BANANA");
		
		List<String> list=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(list);
		
		//default A.O
		List<String> list1=fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);
		
		List<String> list2=fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(list2);
		
		List<String> list3=fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(list3);
		
		List<String> list4=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list4);
		
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"Sravs",25000f));
		productList.add(new Product(2,"uday",30000f));
		productList.add(new Product(3,"Rani",35000f));
		
	}
	

}

