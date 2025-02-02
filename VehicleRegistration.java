public class Vehicle {
    String ownerName, vehicleType;
    static int registrationFee = 5000;

    public Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        Vehicle v2 = new Vehicle("Alice", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
