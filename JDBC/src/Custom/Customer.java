package Custom;

public class Customer {
	public int id;
	public String LastName;
	public String FirstName;
	public int Age;
	public Customer(int id, String lastName, String firstName, int age) {
		super();
		this.id = id;
		LastName = lastName;
		FirstName = firstName;
		Age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}
