# Assignment on SOLID Principle

## Assignment One
### Refactor a Poorly Designed Code (Apply SRP & OCP)

**Original Code**
```class Employee {
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
```
The issue in this code was 


