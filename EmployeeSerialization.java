import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.dat"));
            List<Employee> list = new ArrayList<>();
            list.add(new Employee(1, "Alice", "HR", 50000));
            list.add(new Employee(2, "Bob", "IT", 60000));
            out.writeObject(list);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employees.dat"));
            List<Employee> data = (List<Employee>) in.readObject();
            for (Employee e : data) {
                System.out.println(e.name);
            }
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred.");
        }
    }
}
