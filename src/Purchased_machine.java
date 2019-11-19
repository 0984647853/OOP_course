public class Purchased_machine extends MachinePart {
    private int price;
    private String supplier;
    public Purchased_machine(String name, int number_in_stock, int price, String supplier) {
        super(name, number_in_stock);
        this.price = price;
        this.supplier = supplier;
    }

    @Override
    public int totalValue() {
        return price*super.getNumber_in_stock();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String toString() {
        return "From Purchased: \n" + super.toString() + "\n Name of supplier: "+this.supplier
                +"\n Price of purchased: "+this.price;
    }
}
