import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//using normal method
/*public class BiConsumerDemo implements BiConsumer<Integer,Integer>{

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> biConsumer=new BiConsumerDemo();
		biConsumer.accept(1,2);
	}
	@Override
	public void accept(Integer t, Integer u) {
		System.out.println(t+u);//3
		
	}

}*/

//using anonymous method
/*public class BiConsumerDemo{

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> biConsumer=new BiConsumer<Integer,Integer>(){

			@Override
			public void accept(Integer t, Integer u) {
				System.out.println(t+u);//3
				
			}
		};
		biConsumer.accept(1,2);
	}
}*/


//using lambda
public class BiConsumerDemo{
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> biConsumer= (a,b)->System.out.println(a+b);//3
		biConsumer.accept(1,2);
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(1, "Sravs");
		map.put(2, "Uday");
		map.put(3, "Sravan");
		
		map.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		/*1
Sravs
2
Uday
3
Sravan
*/
	}
}
