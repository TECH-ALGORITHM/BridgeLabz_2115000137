class Employee {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println(totalEmployees);
    }

    void display() {
        if (this instanceof Employee) {
            System.out.println(name + " " + id + " " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 101, "Manager");
        Employee e2 = new Employee("Jane", 102, "Developer");
        e1.display();
        e2.display();
        displayTotalEmployees();
    }
}
