public class Client {
    private String clientName;
    private int clientPartySize;
    private String clientLocation;
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public Client(String clientName, int clientPartySize) {
        this.clientName = clientName;
        this.clientPartySize = clientPartySize;
        this.clientLocation = null;
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

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

}