public class Bill {
    private Customer customer;
    private int old_index;
    private int new_index;

    public Bill(Customer customer, int old_index, int new_index) {
        this.customer = customer;
        this.old_index = old_index;
        this.new_index = new_index;
    }
    public int getTotalMoney(){
        return (new_index-old_index)*750;
    }
    public int getClientID(){
        return this.customer.getClient_id();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "Customer" + customer +
                ", old_index=" + old_index +
                ", new_index=" + new_index +
                '}';
    }

}
