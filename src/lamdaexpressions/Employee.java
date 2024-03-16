package lamdaexpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {

	String employeeName;
	int salary;
	int experience;
	String designation;

	public Employee(String employeeName,int salary,int experience,String designation)
	{
		this.employeeName=employeeName;
		this.salary=salary;
		this.experience=experience;
		this.designation=designation;
	}


	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Ashok", 30000, 5, "AutomationEngineer"));
		employeeList.add(new Employee("Veerababu", 40000, 5, "DevopsEngineer"));
		employeeList.add(new Employee("Vardhan", 50000, 5, "SoftwareEngineer"));

		Function<Employee, Integer> employeeObject = emp->
		{   
			int sal = emp.salary;
			if(sal<=30000)
				return sal*10/100;
			else if(sal>30000 && sal <=40000)
				return sal*20/100;
			else if(sal>40000 && sal <=50000)
				return sal*30/100;
			else
				return sal;

		};

		Predicate<Integer> p = i -> (i>5000);


		for(Employee employee: employeeList)
		{
			int salaryHike = employeeObject.apply(employee);
			if(p.test(salaryHike)) {
				System.out.println(employee.employeeName);
				System.out.println(employee.salary);
				System.out.println(salaryHike);
				System.out.println(employee.designation);
			}
		}

	}


}
