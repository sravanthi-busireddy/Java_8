import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	public static void main(String[] args) {
		List<String> alpha=Arrays.asList("a","b","c");
		//Convert into uppercase 
		
		//Before java 8
		List<String> alphaUpper=new ArrayList<String>();
		for(String s:alpha) {
			alphaUpper.add(s.toUpperCase());
		}
		
		//Using Java 8
		System.out.println(alphaUpper); //[A, B, C]
		List<String> collect= alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);//[A, B, C]
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		//each number multiple by 2
		List<Integer> multiplyNumbers=numbers.stream().map(n -> n*2 ).collect(Collectors.toList());
		System.out.println(multiplyNumbers);//[2, 4, 6, 8, 10]
		
		//map user details to userDTO
		
		
		List<User> userList=new ArrayList<>();
		userList.add(new User(1,"Sravs","sravs@123","sravs@gmail.com"));
		userList.add(new User(2,"Uday","uday@123","Uday@gmail.com"));
		userList.add(new User(3,"Nimmi","Nirmala@123","Nimmi@gmail.com"));
		System.out.println(userList);
		//[User [id=1, userName=Sravs, password=sravs@123, email=sravs@gmail.com], User [id=2, userName=Uday, password=uday@123, email=Uday@gmail.com], User [id=3, userName=Nimmi, password=Nirmala@123, email=Nimmi@gmail.com]]
		
		////Before Java 8
		List<UserDTO> userDTOList=new ArrayList<>();
		for(User us:userList ) {
			userDTOList.add(new UserDTO(us.getId(),us.getUserName(),us.getEmail()));
		}
		System.out.println(userDTOList);
		//[UserDTO [id=1, userName=Sravs, email=sravs@gmail.com], UserDTO [id=2, userName=Uday, email=Uday@gmail.com], UserDTO [id=3, userName=Nimmi, email=Nimmi@gmail.com]]
		
		//using Java 8
		List<UserDTO> userDTOList1=userList.stream().map(user-> new UserDTO(user.getId(),user.getUserName(),user.getEmail())).collect(Collectors.toList());
		System.out.println(userDTOList1);
		//[UserDTO [id=1, userName=Sravs, email=sravs@gmail.com], UserDTO [id=2, userName=Uday, email=Uday@gmail.com], UserDTO [id=3, userName=Nimmi, email=Nimmi@gmail.com]]

	}
}

class UserDTO{
	private int id;
	private String userName;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserDTO(int id, String userName, String email) {
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}	
	
}
class User{
	private int id;
	private String userName;
	private String password;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String userName, String password, String email) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
}
