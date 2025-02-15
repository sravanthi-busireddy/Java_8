import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

class MethodPer{
	public void display(String msg) {
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
}

class Java8Features{
	public static void main(String[] args) {
		
		
		//Reference to static Method
	  Function<Integer,Double> fun=(input)-> Math.sqrt(input);
		System.out.println(fun.apply(4));
		//Reference to instance method of particular object
		
	   MethodPer methodPer=new MethodPer();
	   Printable printable=(msg)-> methodPer.display(msg);
	   printable.print("Hello");
	   MethodPer methodPer1=new MethodPer();
	   Printable printabl=methodPer1::display;
	   printabl.print("Hello");
	   
	 //Reference to instance method of Arbitrary object to specific type
	   Function<String,String> func=(msg)->msg.toLowerCase();
	   System.out.println(func.apply("Hello"));
	   
	   //Reference to a constructor
	   Function<String,String> func1=String::toLowerCase;
	   System.out.println(func1.apply("Hello"));
	   
	   List<String> fruits=new ArrayList<>();
	   fruits.add("apple");
	   fruits.add("banana");
	   fruits.add("papaya");
	   Function<List<String>,Set<String>> funct= (fruitList)->new HashSet<>(fruitList);
	   System.out.println(funct.apply(fruits));
	   Function<List<String>,Set<String>> funct1= HashSet::new;
	   System.out.println(funct.apply(fruits));
	   OptionalUtilities optionalUti=new OptionalUtilities();
	   optionalUti.ofMethod();
	   optionalUti.emptyMethod();
	   optionalUti.ofNullableMethod();
	   optionalUti.optionalOtherMethods();
	   optionalUti.optionalGetMethod();
	   optionalUti.ifPresentMethod();
	   optionalUti.filterMethod();
	   optionalUti.MapMethod();
	}	
}