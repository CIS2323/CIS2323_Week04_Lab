package People;

public class Person{
	private String firstName;
	private String lastName;
	private int age;
	private char sex;
	private int userId;
	public static int userCount = 0;
	public static final int VERSION = 1234;
	
	public static String getInfo(){
		return "Collects and prints information about a user.";
	}
	
	private boolean doThing(){
		return true;
	}
	
	public void setFirstName(String fName){
		firstName = fName;
		userId = userCount;
		userCount++;
	}
	
	public void setFirstName(String fName, String lName){
		firstName = fName;
		lastName = lName;
		userId = userCount;
		userCount++;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lName){
		lastName = lName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public void setSex(char s){
		sex = s;
	}
	public char getSex(){
		return sex;
	}
	public String getPersonInfo(){
		return "First Name: " + firstName + "\n" +
		"Last name: " + lastName + "\n" +
		"Age: " + age + "\n" +
		"Gender : " + sex + "\n" +
		"And is userid: " + userId;
	}
}
