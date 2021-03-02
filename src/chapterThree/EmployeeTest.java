public class EmployeeTest{
	public static void main(String[] args){

	Employee firstEmployee = new Employee("John", "Doe", 200000.00);
	Employee secondEmployee = new Employee("Joe", "Bloggs", 150000.00);

	firstEmployee.setFirstName("Musa");
	System.out.println("The first employee's first name is " + firstEmployee.getFirstName());

	firstEmployee.setLastName("Obi");
	System.out.println("The first employee's last name is " + firstEmployee.getLastName());

	secondEmployee.setFirstName("Ayo");
	System.out.println("The second employee's first name is " + secondEmployee.getFirstName());

	secondEmployee.setLastName("Nasiru");
	System.out.println("The second employee's last name is " + secondEmployee.getLastName());

	firstEmployee.setSalary(300000.00);
	System.out.println("The first employee's salary is " + firstEmployee.getSalary() + " dollars");
	
	secondEmployee.setSalary(500000.00);
	System.out.println("The second employee's salary is " + secondEmployee.getSalary() + " dollars");

	firstEmployee.salaryIncreaseRate(10.0);
	secondEmployee.salaryIncreaseRate(10.0);
	
	System.out.println("After 10% increase, the first employee's new salary is " + firstEmployee.getSalary() + " dollars");
	System.out.println("After 10% increase, the second employee's new salary is " + secondEmployee.getSalary() + " dollars");
}

}