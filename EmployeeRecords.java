class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int id, String dept, double sal) {
        this.employeeID = id;
        this.department = dept;
        this.salary = sal;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public double getSalary() {
        return this.salary;
    }
}

class Manager extends Employee {
    public Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 80000);
        m.display();
        m.setSalary(90000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
