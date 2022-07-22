import java.util.ArrayList;
public class Dispatch {
    private int[][] campusMap = {
        {0, 5, 14, 9, 20},
        {5, 0, 7, 10, 15},
        {14, 7, 0, 11, 12},
        {9, 10, 11, 0, 8},
        {20, 15, 12, 8, 0}
    };
    private ArrayList<Client> clients;
    private ArrayList<Driver> drivers;
    private ArrayList<Ride> fleet;
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Client client1 = new Client("John", 2);
        Ride ride1 = new Ride(16);
        Driver driver1 = new Driver("John");
    }

    public Dispatch(Client[] clients, Driver[] drivers, Ride[] fleet) {
        this.clients = new ArrayList<Client>();
        this.drivers = new ArrayList<Driver>();
        this.fleet = new ArrayList<Ride>();
        for (Client client : clients) {
            this.clients.add(client);
        }
        for (Driver driver : drivers) {
            this.drivers.add(driver);
        }
        for (Ride ride : fleet) {
            this.fleet.add(ride);
        }
    }
}