public class Ride {
    private int capacity;
    private int driverID;
    private int currentClientID;
    private boolean isRideAvailable;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public Ride(int capacity) {
        this.capacity = capacity;
        this.driverID = -1;
        this.currentClientID = -1;
        this.isRideAvailable = true;
    }
}