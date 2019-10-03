public class TestMain4_1 {
    public static void main(String[] args) {
        Date date = new Date("18.08.2018");
        OderLine order_1 = new OderLine("Pencil",2.50,100);
        OderLine order_2 = new OderLine("Notebook",5.00,20);
        OderLine order_3 = new OderLine("Pencil case",14.95,10);

        Feature feature_1 = new Feature(1056,"Charlie Brown",date);
        feature_1.addOrder(order_1);
        feature_1.addOrder(order_2);
        feature_1.addOrder(order_3);

        System.out.println(feature_1.toString());
    }
}
