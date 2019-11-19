public abstract class MachinePart {
    private String name;
    private int number_in_stock;

    public MachinePart(String name, int number_in_stock) {
        this.name = name;
        this.number_in_stock = number_in_stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_in_stock() {
        return number_in_stock;
    }

    public void setNumber_in_stock(int number_in_stock) {
        this.number_in_stock = number_in_stock;
    }

    public String toString() {
        return "Name: "+this.name+"\nNumber in stock: "+this.number_in_stock;
    }

    public abstract int totalValue();
}
