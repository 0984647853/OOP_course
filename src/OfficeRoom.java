import java.util.ArrayList;
import java.util.Scanner;

public class OfficeRoom extends Room {
    private ArrayList<String> staff_name = new ArrayList<>();

    public void AskData() {
        super.AskData();
        Scanner sc = new Scanner(System.in);
        String name;
        while (true) {
            System.out.println("Staff name: ");
            name = sc.nextLine();
            if(name.equals("")) break;
            staff_name.add(name);
        }
    }

    public String toString() {
        String string = super.toString()+" ";
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : staff_name
        ) {
            stringBuilder.append(", ");
            stringBuilder.append(name);
        }
        return string+stringBuilder.toString();
    }

    public boolean isWork(String name) {
        for (String names : staff_name
        ) {
            if (name.equals(names)) {
                return true;
            }
        }
        return false;
    }

}
