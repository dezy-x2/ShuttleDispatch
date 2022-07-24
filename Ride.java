public class Ride {
    private int capacity;
    private int driverID;
    private int currentClientID;
    private boolean isRideAvailable;
    private String location;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public Ride(int capacity) {
        this.capacity = capacity;
        this.driverID = -1;
        this.currentClientID = -1;
        this.isRideAvailable = false;
        this.location = "A";
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

    public String getLocation() {
        return location;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
        this.isRideAvailable = true;
    }

    public void setCurrentClientID(int currentClientID) {
        this.currentClientID = currentClientID;
    }

    public void setIsRideAvailable(boolean isRideAvailable) {
        this.isRideAvailable = isRideAvailable;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}