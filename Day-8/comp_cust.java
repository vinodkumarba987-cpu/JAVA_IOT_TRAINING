
import java.util.*;
class Employee{
	String name;
	String department;
	int salary;
	Employee(String name,String department,int salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
		
	}
	public String toString() {
		return name +" -"+ department +"-"+salary;
		
	}
}

public class comp_cust {
	public static void main(String[] args) {
		
		List<Employee>employees=Arrays.asList(
				new Employee("Arya","IT",90000),
				new Employee("Ajay","HR",80000),
				new Employee("Vijay","tester",70000),
				new Employee("Vinod","AT",50000)
				);
		employees.sort(
				Comparator.comparing((Employee e) -> e.salary).thenComparing((Employee e) -> e.salary,Comparator.reverseOrder()).thenComparing(e -> e.name));
		for(Employee e:employees) {
			System.out.println(e);
		}
	}

}