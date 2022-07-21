public class Driver {
    private String driverName;
    private boolean driverIsAvailable;
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public Driver(String driverName) {
        this.driverName = driverName;
        this.driverIsAvailable = true;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean getDriverIsAvailable() {
        return driverIsAvailable;
    }

    public void setDriverIsAvailable(boolean driverIsAvailable) {
        this.driverIsAvailable = driverIsAvailable;
    }

}