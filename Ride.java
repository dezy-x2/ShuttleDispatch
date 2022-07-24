public class Ride {
    private int capacity;
    private Driver driver;
    private int currentClientID;
    private boolean isRideAvailable;
    private String location;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public Ride(int capacity) {
        this.capacity = capacity;
        this.driver = null;
        this.currentClientID = -1;
        this.isRideAvailable = false;
        this.location = "A";
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getDriverID() {
        return this.driver.getDriverID();
    }

    public Driver getDriver() {
        return this.driver;
    }

    public int getCurrentClientID() {
        return this.currentClientID;
    }

    public boolean getIsRideAvailable() {
        return this.isRideAvailable;
    }

    public String getLocation() {
        return this.location;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
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