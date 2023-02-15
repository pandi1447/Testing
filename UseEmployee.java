package collection3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e2=new Employee("Pandi",30,1042,"male",30000,9600620412L);
		Employee e3=new Employee("Lakshmi",25,1045,"female",37000,9600610422L);
		Employee e4=new Employee("Maha",32,1044,"female",28000,9605610411L);
		Employee e5=new Employee("Ravi",26,1043,"male",45000,9500690795L);
		Employee e6=new Employee("Manohar",35,1001,"male",102500,9500680911L);
		Employee e7=new Employee("Vijay",34,1002,"male",75000,9600610711L);
		Employee e8=new Employee("Sneha",45,998,"female",200000,9600698011L);
		Employee e9=new Employee("Kaviya",50,1003,"female",250000,9600620511L);
		Employee e10=new Employee("Kamal",39,1000,"male",150000,9600610871L);
		ArrayList<Employee>employees=new ArrayList<>();
		employees.add(new Employee("Muthu",27,1040,"male",25000,9600610411L));
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		List<Employee>maleEmp=employees.stream().filter(x->x.getGender().equalsIgnoreCase("Male")).collect(Collectors.toList());
		System.out.println(maleEmp);
		long femaleCount=employees.stream().filter(y->y.getGender().equalsIgnoreCase("Female")).count();
		System.out.println(femaleCount);
		List<Employee>below50=employees.stream().filter(x->x.getSalary()>=25000&&x.getSalary()<=50000).collect(Collectors.toList());
		System.out.println(below50);
		long above100000=employees.stream().filter(y->y.getSalary()>=100000).count();
		System.out.println(above100000);
		Map<Integer,Employee>above32=employees.stream().filter(y->y.getAge()>=32).collect(Collectors.toMap(z->z.getId(),z->z));
		System.out.println(above32);
		List<Integer>employeesId=employees.stream().map(x->x.getId()).collect(Collectors.toList());
		System.out.println(employeesId);
		List<Integer>femaleSalary=employees.stream().filter(x->x.getGender().equalsIgnoreCase("Female")).map(y->y.getSalary()).collect(Collectors.toList());
		System.out.println(femaleSalary);
		
		List<String>ab=Arrays.asList("Lakshmi","pathi","Muthu");
		boolean a=ab.stream().anyMatch(null);
		System.out.println(a);
		
		
	}

}
