public class PreferredCus extends Customer {

    private double purchases;

    PreferredCus(int customer_num, String name, String address, double purchases) {
        super(customer_num, name, address);
        this.purchases = purchases;
    }

    public double calculateBonus() {
        double bonus=0;
        if (this.purchases>=500&&this.purchases<=1000)
            bonus = (0.02)*purchases;
        else if (this.purchases >= 1000) {
            bonus =  (0.05)*purchases;
        }
        return bonus;
    }

    public String toString() {
        return super.toString()+"\nPurchases: "+this.purchases+"\nBonus: "+this.calculateBonus();
    }

}
