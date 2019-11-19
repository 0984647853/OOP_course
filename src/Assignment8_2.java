import java.io.*;
import java.util.ArrayList;

public class Assignment8_2 {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        try {
            BufferedReader input = new BufferedReader(new FileReader("customer.txt"));
            String type;
            String id,name,address,purchase;
            int num;
            double purchase_num;
            while ((type = input.readLine()) != null) {
                if (type.equals("customer")){
                    id = input.readLine();
                    num = Integer.parseInt(id);
                    name = input.readLine();
                    address = input.readLine();
                    Customer customer = new Customer(num,name,address);
                    customerArrayList.add(customer);
                }
                else {
                    id = input.readLine();
                    num = Integer.parseInt(id);
                    name = input.readLine();
                    address = input.readLine();
                    purchase = input.readLine();
                    purchase_num = Double.parseDouble(purchase);
                    PreferredCus preferredCus = new
                            PreferredCus(num,name,address,purchase_num);
                    customerArrayList.add(preferredCus);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Customer customer:customerArrayList
             ) {
            System.out.println(customer.toString());
            System.out.println("___________________________");
        }
    }
}
