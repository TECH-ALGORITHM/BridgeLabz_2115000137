public class HotelBooking {
    String guestName, roomType;
    int nights;

    public HotelBooking() {
        guestName = "";
        roomType = "";
        nights = 0;
    }

    public HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    public HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("John Doe", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1);
        h1.display();
        h2.display();
    }
}
