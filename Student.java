package collection3;

public class Student {
	private String name;
	private int id;
	private int age;
	private String gender;
	private int fees;
	private String section;
	private String standard;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Student(String name, int age, int id, String gender, int fees, String section, String standard) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.fees = fees;
		this.section = section;
		this.standard = standard;
	}
	public String toString() {
		return "name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", fees=" + fees+ ", section=" + section + ", standard=" + standard;
	}
	

}
