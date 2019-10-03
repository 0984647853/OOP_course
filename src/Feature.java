import java.util.ArrayList;

public class Feature {
    private int order_id;
    private String name_customer;
    private Date date;
    private ArrayList<OderLine> order = new ArrayList<>();


    public Feature(int order_id, String name_customer, Date date) {
        this.order_id = order_id;
        this.name_customer = name_customer;
        this.date = date;
    }

    public void addOrder(OderLine oderLine) {
        order.add(oderLine);
    }

    public double totalPrice() {
        double total=0;
        for (OderLine odering:order) {
            total+= odering.Sum();
        }
        return total;
    }
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("OrderId: ").append(this.order_id).append("\n");
        str.append("Customer: ").append(this.name_customer).append("\n");
        str.append("Order date: ").append(this.date).append("\n");
        str.append("Product").append("\t\t").append("Price").append("\t").append("Quantity").append("\t").append("Sum");
        for (OderLine ordering:order) {
            str.append("\n");
            str.append(ordering.getName()).append("\t\t").append(ordering.getPrice()).append("\t\t").append(ordering.getQuantity()).append("\t\t").append(ordering.Sum());
        }
        str.append("\n").append("Total price: ").append(this.totalPrice());
        return str.toString();
    }
}
