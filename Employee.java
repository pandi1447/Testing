package collection3;

public class Employee {
	private String name;
	private int age;
	private int id;
	private String gender;
	private int salary;
	private long mobileNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Employee(String name, int age, int id, String gender, int salary, long mobileNo) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.gender = gender;
		this.salary = salary;
		this.mobileNo = mobileNo;
	}
	public String toString() {
		return "name=" + name + ", age=" + age + ", id=" + id + ", gender=" + gender + ", salary=" + salary+ ", mobileNo=" + mobileNo;
	}
	

}
