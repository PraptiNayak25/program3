package program3;

public  class Employee extends Person {
    private String empId;
    private double salary;

    public Employee(String name, String dobStr, String empId, double salary) {
        super(name, dobStr);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice Johnson", "1990-06-15", "EMP12345", 75000.00);
        emp.displayEmployee();
    }
}
 