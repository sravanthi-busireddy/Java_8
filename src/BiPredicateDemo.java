import java.util.function.BiPredicate;

//using normal method
/*public class BiPredicateDemo implements BiPredicate<Integer,Integer>{
	
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biPredicate=new BiPredicateDemo();
		System.out.println(biPredicate.test(3, 2));//true
		System.out.println(biPredicate.test(2, 3));//false
	}

	@Override
	public boolean test(Integer t, Integer u) {
		return t>u;
	}	
}*/

//using anonymus method
/*public class BiPredicateDemo {
	
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biPredicate=new BiPredicate<Integer,Integer>(){

			@Override
			public boolean test(Integer t, Integer u) {
				return t>u;
			}
		};
		System.out.println(biPredicate.test(3, 2));//true
		System.out.println(biPredicate.test(2, 3));//false
	}	
}*/

//using lambda
public class BiPredicateDemo {
	
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biPredicate= (a,b)->a>b;
		System.out.println(biPredicate.test(3, 2));//true
		System.out.println(biPredicate.test(2, 3));//false
		
		BiPredicate<Integer,Integer> biPredicate2=(a,b)->a>b;
		BiPredicate<Integer,Integer> biPredicate3=(a,b)->a==b;
		
		System.out.println(biPredicate.and(biPredicate3).test(3, 2));//false
		System.out.println(biPredicate.or(biPredicate3).test(3, 2));//true
		
		
	}	
}