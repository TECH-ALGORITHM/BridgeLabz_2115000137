class Vehicle {
    static int registrationFee = 500;
    final int registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println(ownerName + " " + vehicleType + " " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", 301);
        Vehicle v2 = new Vehicle("Bob", "Bike", 302);
        v1.display();
        v2.display();
        updateRegistrationFee(600);
        System.out.println(registrationFee);
    }
}
