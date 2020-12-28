public class Customer {
    private String name;
    private int houseNumber;
    private int client_id;

    public Customer(String name, int houseNumber, int client_id) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.client_id = client_id;
    }

    public int getClient_id() {
        return client_id;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", client_id=" + client_id +
                '}';
    }
}
