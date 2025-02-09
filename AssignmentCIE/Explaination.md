# Assignments on SOLID Principle

## Assignment One
### Refactor a Poorly Designed Code (Apply SRP & OCP)

#### Objective:
Identify violations of the Single Responsibility Principle (SRP) and Open/Closed Principle (OCP) and refactor the code to follow these principles.

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
The issue in this code was that:  
**The Employee class had multiple responsibilities:**
-	Representing employee data
-	Handling printing
-	Managing database storage  

*This was violating SRP & OCP Principle*

**SOLUTION:**  
* Introduced new classes and an interface to enhance the design.
* Divided responsibilities among Employee, PaySlipPrinter, and StorageSystem, resolving the SRP violation.
* Converted StorageSystem into an interface, making it open for extension without altering existing code.
* Enabled the use of different storage systems without requiring code modifications.

## Assignment Two
###  Implement Liskov Substitution Principle (LSP)  
#### Objective:
To avoid breaking the Liskov Substitution Principle (LSP) by designing a proper class hierarchy.  

**Original Code**
```
    class Bird {
        void fly() { System.out.println("Flying"); }
    }

    class Penguin extends Bird {
        // Penguins can't fly!
    }

```
*Here, Penguin extends Bird, but Penguins cannot fly, violating LSP.*  

**SOLUTION:**
* Added the chirp() behavior in the Bird class, applicable to all subclasses.
* Introduced two new classes, FlyingBird and NonFlyingBird, which extend Bird but have distinct behaviors.
* Ensured Penguin can now extend NonFlyingBird without violating the LSP.


## Assignment Three
### Design a Payment Processing System (Apply All SOLID Principles)
#### Objective:
Design a scalable, maintainable payment processing system using all SOLID principles.

**SOLUTION**
- Each class handles a specific responsibility, such as payment logic or transaction management, ensuring maintainability and clarity.
- New payment methods can be added by extending the PaymentMethod interface without modifying existing code.
- PaymentSoftware works seamlessly with any subclass of PaymentMethod, maintaining program correctness.
- The PaymentMethod interface is simple and focused, requiring only the payment() method for implementation.-
- PaymentSoftware uses the PaymentMethod interface, making it flexible and independent of specific payment types.





