public class Client {
    private String clientName;
    private int clientPartySize;
    private String clientLocation;
    private int clientID;
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public Client(String clientName, int clientPartySize, String clientLocation) {
        this.clientName = clientName;
        this.clientPartySize = clientPartySize;
        this.clientLocation = clientLocation;
    }

    public String getClientName() {
        return clientName;
    }

    public int getClientPartySize() {
        return clientPartySize;
    }

    public String getClientLocation() {
        return clientLocation;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

}