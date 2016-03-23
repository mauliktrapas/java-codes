
public class Employee {
	public String name;
	public int tenure,salary,id;
	
	Employee left,right;
	
	public Employee(String name, int tenure, int salary, int id) {
		this.name = name;
		this.tenure = tenure;
		this.salary = salary;
		this.id = id;
	}
}
