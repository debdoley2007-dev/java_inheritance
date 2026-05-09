// Employee Management System using Inheritance

class Employee {
    String name;
    int employeeId;
    double salary;

    // Constructor
    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    double bonus;

    // Constructor
    FullTimeEmployee(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    // Method to calculate total salary
    double calculateSalary() {
        return salary + bonus;
    }

    // Override display method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    // Constructor
    PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate salary
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // Override display method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {

        // Full-time employee object
        FullTimeEmployee emp1 =
                new FullTimeEmployee("Vijay", 101, 50000, 10000);

        // Part-time employee object
        PartTimeEmployee emp2 =
                new PartTimeEmployee("Ajay", 102, 500, 40);

        System.out.println("Full-Time Employee Details:");
        emp1.displayDetails();

        System.out.println("\nPart-Time Employee Details:");
        emp2.displayDetails();
    }
}