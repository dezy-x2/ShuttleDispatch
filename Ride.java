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

    public int getCapacity() {
        return capacity;
    }

    public int getDriverID() {
        return driverID;
    }

    public int getCurrentClientID() {
        return currentClientID;
    }

    public boolean getIsRideAvailable() {
        return isRideAvailable;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public void setCurrentClientID(int currentClientID) {
        this.currentClientID = currentClientID;
    }

    public void setIsRideAvailable(boolean isRideAvailable) {
        this.isRideAvailable = isRideAvailable;
    }
}