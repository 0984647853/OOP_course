public class LocalMachine extends MachinePart {
    private int amount_raw;
    private int price_raw;

    public LocalMachine(String name, int number_in_stock, int amount_raw, int price_raw){
        super(name,number_in_stock);
        this.amount_raw = amount_raw;
        this.price_raw = price_raw;
    }

    @Override
    public int totalValue() {
        return price_raw * amount_raw * super.getNumber_in_stock();
    }

    public int getAmount_raw() {
        return amount_raw;
    }

    public void setAmount_raw(int amount_raw) {
        this.amount_raw = amount_raw;
    }

    public int getPrice_raw() {
        return price_raw;
    }

    public void setPrice_raw(int price_raw) {
        this.price_raw = price_raw;
    }

    public String toString() {
        return "From Local: \n"+super.toString() + "\n Amount of raw: "+this.amount_raw
                +"\n Amount of raw: "+this.price_raw;
    }
}
