
public class OderLine {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private String name;
    private double price;
    private int quantity;

    public OderLine (String name, double price, int quantity) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public double Sum() {
        return this.price*this.quantity;
    }
    public void getData() {
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("Quantity: "+this.quantity);
    }
}
