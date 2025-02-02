public class CarRental {
    String customerName, carModel;
    int rentalDays, costPerDay, totalCost;

    public CarRental() {
        customerName = "";
        carModel = "";
        rentalDays = 0;
        costPerDay = 100;
        totalCost = 0;
    }

    public CarRental(String c, String m, int d, int cost) {
        customerName = c;
        carModel = m;
        rentalDays = d;
        costPerDay = cost;
        totalCost = rentalDays * costPerDay;
    }

    public void calculateCost() {
        totalCost = rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays + ", Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental cr1 = new CarRental("Robert", "Toyota", 5, 200);
        cr1.calculateCost();
        cr1.display();
    }
}
