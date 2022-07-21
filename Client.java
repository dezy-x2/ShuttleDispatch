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

}