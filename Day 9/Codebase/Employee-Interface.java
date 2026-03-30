interface Employee {
    void calculateSalary();
    void displayDetails();
}

class FullTimeEmployee implements Employee {
    int empId;
    String name;
    double salary;

    FullTimeEmployee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
  
    public void calculateSalary() {
        System.out.println("Full-Time Salary: " + salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

class PartTimeEmployee implements Employee {
    int empId;
    String name;
    int hours;
    double rate;

    PartTimeEmployee(int empId, String name, int hours, double rate) {
        this.empId = empId;
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    public void calculateSalary() {
        double salary = hours * rate;
        System.out.println("Part-Time Salary: " + salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(201, "Kumar", 45000);
        Employee e2 = new PartTimeEmployee(202, "Ravi", 5, 150);

        e1.displayDetails();
        e1.calculateSalary();

        System.out.println();

        e2.displayDetails();
        e2.calculateSalary();
    }
}
