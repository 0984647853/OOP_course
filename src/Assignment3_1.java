import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3_1 {
    public static void main(String[] args) {
//        Rectangle rectangle_1 = new Rectangle();
//        Rectangle rectangle_2 = new Rectangle(5, 7);
//        Rectangle rectangle_3 = new Rectangle(2, 3, 10, 9);
//        System.out.println("Width of 3 rectangle: "+ rectangle_1.width()
//                +" | "+rectangle_2.width()+" | "+rectangle_3.width());
//        System.out.println("Height of 3 rectangle: "+ rectangle_1.height()
//                +" | "+rectangle_2.height()+" | "+rectangle_3.height());
//        System.out.println("Area of 3 rectangle: "+ rectangle_1.area()
//                +" | "+rectangle_2.area()+" | "+rectangle_3.area());
        Scanner sc = new Scanner(System.in);
        String data;
        ArrayList<Date> dateArrayList = new ArrayList<>();
        do {
            System.out.println("Input your date: ");
            data = sc.nextLine();
            if(!data.isEmpty()) {
                Date date = new Date(data);
                dateArrayList.add(date);
            }else break;
        }while (true);

        for (Date dating : dateArrayList) {
            System.out.println(dating.LongFormOfDate());
        }
        do {
            System.out.println("Give a date need to search");
            data = sc.nextLine();
            if(!data.isEmpty()) {
                Date date = new Date(data);
                int i=0;
                do{
                    if (date.equals(dateArrayList.get(i))) {
                        System.out.println(i);
                        break;
                    }
                    else i++;
                }while (i<dateArrayList.size());
                if(i==dateArrayList.size())
                System.out.println("Not found");
            }
            else break;
        }while (true);
    }
}
