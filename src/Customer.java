public class Customer {
    public int getCustomer_num() {
        return customer_num;
    }

    public void setCustomer_num(int customer_num) {
        this.customer_num = customer_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int customer_num;
    private String name;
    private String address;

    Customer(int customer_num, String name, String address) {
        this.customer_num = customer_num;
        this.name = name;
        this.address = address;
    }
    public String toString() {
        return "ID: "+this.customer_num+"\nName: "+this.name+"\nAddress: "+this.address;
    }

}

