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

        Client client1 = new Client("John", 2, "B");
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

    private int locationIndex(String location) {
        if (location.equals("A")) {
            return 0;
        } else if (location.equals("B")) {
            return 1;
        } else if (location.equals("C")) {
            return 2;
        } else if (location.equals("D")) {
            return 3;
        } else if (location.equals("E")) {
            return 4;
        } else {
            return -1;
        }
    }

    private int distance(String location1, String location2) {
        int index1 = locationIndex(location1);
        int index2 = locationIndex(location2);
        return campusMap[index1][index2];
    }
}