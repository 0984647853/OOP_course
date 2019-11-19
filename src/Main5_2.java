import java.util.ArrayList;

public class Main5_2 {
    public static void main(String[] args) {
        PreferredCus customer1 = new PreferredCus(1,"Toan","Olym 2",600);
        PreferredCus customer2 = new PreferredCus(2, "Long", "Olym 3",100);
        PreferredCus customer3 = new PreferredCus(3, "Nhan", "Olym 4",1300);
        Customer     customer4 = new Customer(4, "Hoang", "Olym 5");
        Customer     customer5 = new Customer(5, "Minh", "Olym 6");
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        customerArrayList.add(customer1);
        customerArrayList.add(customer2);
        customerArrayList.add(customer3);
        customerArrayList.add(customer4);
        customerArrayList.add(customer5);
        for (Customer customer : customerArrayList
        ) {
            System.out.println(customer.toString());
            System.out.println("************");
        }
        System.out.println("Preferred: ");
        for (Customer customer : customerArrayList
        ) {
            if(customer instanceof PreferredCus)
            System.out.println(customer.toString());
            System.out.println("************");
        }
    }
}
