public class Driver {
    private String driverName;
    private boolean driverIsAvailable;
    private int driverID;
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public Driver(String driverName) {
        this.driverName = driverName;
        this.driverIsAvailable = true;
        this.driverID = (int)Math.floor(Math.random() * 10000) + 1;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean getDriverIsAvailable() {
        return driverIsAvailable;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverIsAvailable(boolean driverIsAvailable) {
        this.driverIsAvailable = driverIsAvailable;
    }

}