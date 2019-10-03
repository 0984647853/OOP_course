import java.util.HashMap;
import java.util.Scanner;

public class Assignment_3_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<Integer,Double> product = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        product.put(1, 150.3);
        product.put(2, 43.5);
        product.put(3, 54.1);
        product.put(50, 45.0);
        product.put(100, 12.5);
        do {
            System.out.print("Give the product number to see price: ");
            System.out.println("( To stop input 0 )");
            int i = sc.nextInt();
            if (i!=0) {
                if(product.containsKey(i))
                    System.out.println(product.get(i));
                else System.out.println("Not found");
            }
            else break;
        }while (true);
    }

}
