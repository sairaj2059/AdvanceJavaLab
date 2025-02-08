//1. Refactor the code to separate concerns using SRP.
//2. Modify the design so that adding new storage methods (e.g., saving to a file instead of a database) follows OCP.
//3. Submit a before-and-after comparison with an explanation


//Without SO Principle: 

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
        	this.name = name;
      		this.salary = salary;
     	}

     	void printPaySlip() {
        	 System.out.println("Employee: " + name + ", Salary: $" + salary);
     	}

     	void saveToDatabase() {
		System.out.println("Saving employee to database...");
     	}
}
 

//With SO principle:

class Employee{
	private String name;
	private double salary;
	
}

class PaySlipPrinter{
	public void printSlip(Employee employee){
	System.out.println("Slip Printed by calliing get methods!!");
	}	
}

interface StorageSystem{
	void storeEmployeeDetails(Employee employee);
}

class DatabaseStorageSystem implements StorageSystem{
	void storeEmployeeDetails(Employee employee){
		System.out.println("Saved details to database");
	}
}

class FileStorageSystem implements(Employee employee){
	void storeEmployeeDetails(Employee employee){
		System.out.println("Saved details to File");
	}
}
