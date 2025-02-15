import java.util.Optional;

public class OptionalUtilities {
	public void ofMethod() {
	String email="Sravs@gmail.com";
	Optional<String> emailOptional=Optional.of(email);
	System.out.println(emailOptional);
	}
	
	public void emptyMethod() {
		String email="";
	Optional<String> emailOptional=Optional.empty();
	System.out.println(emailOptional);
	}
	
	public void ofNullableMethod() {
		String email="";
		Optional<String> emailOptional=Optional.ofNullable(email);
		System.out.println(emailOptional);
        email="Sravs@gmail.com";
		Optional<String> emailOptional1=Optional.ofNullable(email);
		System.out.println(emailOptional1);
		}
	 public void optionalGetMethod() {
	    String email="Sravs@gmail.com";
		Optional<String> emailOptional=Optional.ofNullable(email);
		System.out.println(emailOptional.get());
        email="";
		Optional<String> emailOp=Optional.ofNullable(email);
		String defaultOptional= emailOp.orElseGet(()->"default@gmail.com");
		System.out.println(defaultOptional);
	 }
	 public void optionalOtherMethods() {
	        String email="";
			Optional<String> emailOp=Optional.ofNullable(email);
			String defaultOptional= emailOp.orElseThrow(()-> new IllegalArgumentException("Email is not exist"));
			System.out.println(defaultOptional);
		 }
	 public void ifPresentMethod() {
		 Optional<String> gender= Optional.of("MALE");
		 Optional<String> emptyOpt=Optional.empty();
		 gender.ifPresent((s)->System.out.println(s));
		 emptyOpt.ifPresent((s)->System.out.println(s));
	 }
	 public void filterMethod() {
		 String result="abc";
		 if(result!= null && result.contains("abc")){
			 System.out.println(result);
		 }
		 //using filter
		 Optional<String> optionalRes=Optional.of(result);
		 optionalRes.filter(res->result.contains("abc"))
		     .ifPresent((res)->System.out.println(res));
	 }
	 public void MapMethod() {
		 String result="ab c ";
		 Optional<String> optionalRes=Optional.of(result);
		 optionalRes.filter(res->result.contains("abc"))
		     .map(String::trim)
		     .ifPresent((res)->System.out.println(res));
	 }
		
}
