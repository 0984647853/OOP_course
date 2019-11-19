import java.util.ArrayList;
public class Main6_2 {
    public static void main(String[] args) {
        Date date1 = new Date("10.02.2015");
        Date date2 = new Date("31.12.2020");
        Date date3 = new Date("31.10.2020");
        ArrayList<Date> dateArrayList = new ArrayList<>();
        dateArrayList.add(date1);
        dateArrayList.add(date2);
        dateArrayList.add(date3);
        dateArrayList.sort((o1, o2) -> {
            int a = 0;
            if (o1.getYear() > o2.getYear()) {
                a = 1;
            } else if (o1.getYear() == o2.getYear()) {
                if (o1.getMonth() > o2.getMonth()) {
                    a = 1;
                } else if (o1.getMonth() == o2.getMonth()) {
                    if (o1.getDay() > o2.getDay()) {
                        a = 1;
                    } else if (o1.getDay() == o2.getDay()) {
                        a = 0;
                    } else {
                        a = -1;
                    }
                } else {
                    a = -1;
                }
            } else {
                a = -1;
            }
            return a;
        });
        for (Date dating:dateArrayList) {
            System.out.println(dating);
        }
    }
}
