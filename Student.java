class Student {
    static String universityName = "XYZ University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    int grade;

    Student(String name, int rollNumber, int grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println(totalStudents);
    }

    void display() {
        if (this instanceof Student) {
            System.out.println(name + " " + rollNumber + " " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mark", 201, 90);
        Student s2 = new Student("Emma", 202, 85);
        s1.display();
        s2.display();
        displayTotalStudents();
    }
}
