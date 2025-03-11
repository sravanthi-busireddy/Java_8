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
		productList.add(new Product(1,"Sravs",35000f));
		productList.add(new Product(2,"uday",32000f));
		productList.add(new Product(3,"Rani",20000f));
		
		//using Comparator get Price in A.O
		List<Product> listProducts= productList.stream().sorted(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return  (int) (o1.getPrice()-o2.getPrice());
			}
		}	).collect(Collectors.toList());
		System.out.println(listProducts);
		
	//[Product [id=3, name=Rani, price=20000.0], Product [id=2, name=uday, price=32000.0], Product [id=1, name=Sravs, price=35000.0]]
	   
	//using Comparator get Price in D.O
			List<Product> listProducts1= productList.stream().sorted(new Comparator<Product>() {

				@Override
				public int compare(Product o1, Product o2) {
					return  (int) (o2.getPrice()-o1.getPrice());
				}
			}	).collect(Collectors.toList());
			System.out.println(listProducts1);
	//[Product [id=1, name=Sravs, price=35000.0], Product [id=2, name=uday, price=32000.0], Product [id=3, name=Rani, price=20000.0]]
			
			//Names in A.O
			List<Product> listProducts3= productList.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
			System.out.println(listProducts3);
			//[Product [id=3, name=Rani, price=20000.0], Product [id=1, name=Sravs, price=35000.0], Product [id=2, name=uday, price=32000.0]]
			
			//Names in D.O
			List<Product> listProducts4= productList.stream().sorted(Comparator.comparing(Product::getName).reversed()).collect(Collectors.toList());
			System.out.println(listProducts4);
			//[Product [id=2, name=uday, price=32000.0], Product [id=1, name=Sravs, price=35000.0], Product [id=3, name=Rani, price=20000.0]]
			
			List<Product> listProducts5= productList.stream().sorted(Comparator.comparingInt(Product::getId).reversed()).collect(Collectors.toList());
			System.out.println(listProducts5);
			//[Product [id=3, name=Rani, price=20000.0], Product [id=2, name=uday, price=32000.0], Product [id=1, name=Sravs, price=35000.0]]
	}	
}
	



