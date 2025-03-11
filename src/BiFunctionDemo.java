import java.util.function.BiFunction;
import java.util.function.Function;

//using normal method
/*public class BiFunctionDemo implements BiFunction<Integer,Integer,Integer>{

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> biFunction= new BiFunctionDemo();
		System.out.println(biFunction.apply(1,2));//3
	}

	@Override
	public Integer apply(Integer t, Integer u) {
		return t+u;
	}

}*/

//using anonymous method
/*public class BiFunctionDemo{
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> biFunction= new BiFunction<Integer,Integer,Integer>(){
			
            @Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		System.out.println(biFunction.apply(1, 3));//4
	}
}*/

//using lambda
public class BiFunctionDemo{
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> biFunction= (a,b)->a+b;
		System.out.println(biFunction.apply(1, 3));//4
		Function<Integer,Integer> function=(num)->num*num;
		System.out.println(biFunction.andThen(function).apply(1, 2));//9
	}
}

