class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int roll, String name, double cgpa) {
        this.rollNumber = roll;
        this.name = name;
        this.CGPA = cgpa;
    }

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return this.CGPA;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int roll, String name, double cgpa) {
        super(roll, name, cgpa);
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 3.8);
        pg.display();
        pg.setCGPA(4.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
