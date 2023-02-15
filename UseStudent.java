package collection3;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;


public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Muthu",27,1040,"male",25000,"A","X");
		Student s2=new Student("Pandi",30,1042,"male",30000,"A","XI");
		Student s3=new Student("Lakshmi",25,1045,"female",37000,"B","X");
		Student s4=new Student("Maha",32,1044,"female",28000,"B","X");
		Student s5=new Student("Ravi",26,1043,"male",45000,"A","XI");
		Student s6=new Student("Manohar",35,1001,"male",102500,"A","X");
		Student s7=new Student("Vijay",34,1002,"male",75000,"A","XI");
		Student s8=new Student("Sneha",45,998,"female",200000,"B","XI");
		Student s9=new Student("Kaviya",50,1003,"female",250000,"A","XII");
		Student s10=new Student("Kamal",39,1000,"male",150000,"A","XII");
		ArrayList<Student>students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		List<Student>males=students.stream().filter(x->x.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
		System.out.println(males);
		long femcount=students.stream().filter(x->x.getGender().equalsIgnoreCase("female")).count();
		System.out.println(femcount);
		List<Student>alphabet=students.stream().sequential().collect(Collectors.toList());
		System.out.println(alphabet);
		List<Student>sorting=students.stream().filter(x->x.getName().startsWith("K")).collect(Collectors.toList());
		System.out.println(sorting);
		Map<Integer,Student>standards=students.stream().filter(y->y.getAge()>=32).collect(Collectors.toMap(z->z.getAge(), z->z));
		System.out.println(standards);
		List<Integer>id=students.stream().map(x->x.getId()).collect(Collectors.toList());
		System.out.println(id);
		List<Student>max1=students.stream().distinct().collect(Collectors.toList());
		System.out.println(max1);
	}

}
